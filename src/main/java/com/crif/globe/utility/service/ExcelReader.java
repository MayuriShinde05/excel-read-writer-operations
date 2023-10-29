package com.crif.globe.utility.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.crif.globe.utility.config.PropertyHandler;
import com.crif.globe.utility.domain.s1.request.S1Request;
import com.crif.globe.utility.domain.s1.response.S1Response;

@Service("readExcel")
public class ExcelReader {

	private static final Logger LOGGER = LoggerFactory.getLogger(ExcelReader.class);

	@Autowired
	S1RequestService requestService;

	@Value("${com.crif.globe.s1path}")
	String filePath;

	@Value("${com.crif.globe.s1noOfSheet}")
	Integer numberOfSheet;

	@Autowired
	PropertyHandler property;

	// @Scheduled(cron = "${GLOBE.S1Execution.Scheduler.cron}")
	public String prepareOrchestratorRequest() throws IOException {
		LOGGER.info("Execution started : " + LocalDateTime.now());

		filePath = property.getS1path();
		numberOfSheet = property.getS1noOfSheet();

		S1Request request = new S1Request();
		InputStream inp = new FileInputStream(filePath);
		XSSFWorkbook workbook = new XSSFWorkbook(inp);
		if (numberOfSheet == null || numberOfSheet < 0) {
			numberOfSheet = workbook.getNumberOfSheets();
		}
		for (int i = 0; i < numberOfSheet; i++) {
			// Getting the Sheet at index i
			Sheet sheet = workbook.getSheetAt(i);
			// Create a DataFormatter to format and get each cell's value as String
			DataFormatter dataFormatter = new DataFormatter();
			// 1. You can obtain a rowIterator and columnIterator and iterate over them
			try {

				int totalRecords = sheet.getPhysicalNumberOfRows() - 1;

				List<S1Response> initialisationObjects = new ArrayList<>();

				LOGGER.debug("Batch size is: {0} " + totalRecords);
				for (int l = 1; l <= totalRecords; l++) {
					initialisationObjects = requestService.initialisationObjects(request, sheet, dataFormatter, l,
							initialisationObjects, property);
				}
				LOGGER.info("Execution Finished : " + LocalDateTime.now());

				LOGGER.debug("Size of response : " + initialisationObjects.size());
				requestService.writeS1ResponseExcel(initialisationObjects, 0, property.getS1responseFile(),
						property.getS1sheetname());

			} catch (Exception e) {
				throw new IOException("Excel processing error : " + e.getMessage());
			}

			workbook.close();
		}
		return "OK";

	}
}