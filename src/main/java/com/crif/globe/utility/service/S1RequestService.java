package com.crif.globe.utility.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.crif.globe.utility.config.PropertyHandler;
import com.crif.globe.utility.domain.s1.request.Application;
import com.crif.globe.utility.domain.s1.request.ApplicationVariables;
import com.crif.globe.utility.domain.s1.request.Body;
import com.crif.globe.utility.domain.s1.request.Categories;
import com.crif.globe.utility.domain.s1.request.Customer;
import com.crif.globe.utility.domain.s1.request.CustomerVariables;
import com.crif.globe.utility.domain.s1.request.Header;
import com.crif.globe.utility.domain.s1.request.S1Request;
import com.crif.globe.utility.domain.s1.request.StrategyOneRequest;
import com.crif.globe.utility.domain.s1.response.S1Response;
import com.crif.globe.utility.service.s1.GlobeStrategyOneService;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

@Service
public class S1RequestService {

	@Autowired
	GlobeStrategyOneService globeStrategyOneService;

	private static final Logger LOGGER = LoggerFactory.getLogger(S1RequestService.class);

	public List<S1Response> initialisationObjects(S1Request request, Sheet sheet, DataFormatter dataFormatter, int l,
			List<S1Response> initialisationObjects, PropertyHandler property) throws IOException {
		StrategyOneRequest strategyOneRequest = new StrategyOneRequest();
		Header header = new Header();

		header.setInquiryCode(property.getS1inquiryCode());
		header.setProcessCode(property.getS1processCode());
		Body body = new Body();

		ApplicationVariables applicationVariables = new ApplicationVariables();
		List<Categories> categories = new ArrayList<>();

		Categories category = new Categories();
		Customer customer = new Customer();
		CustomerVariables customerVariables = new CustomerVariables();

		final Row row = sheet.getRow(l);

		Application application = new Application();

		for (int m = 0; m < row.getPhysicalNumberOfCells(); m++) {
			setS1Request(dataFormatter, applicationVariables, customerVariables, row, m);
		}
		applicationVariables.setBrand(property.getBrandName());

		application.setVariables(applicationVariables);

		customer.setVariables(customerVariables);
		category.setCustomer(customer);
		categories.add(category);
		application.setCategories(categories);

		body.setApplication(application);

		strategyOneRequest.setHeader(header);
		strategyOneRequest.setBody(body);

		request.setStrategyOneRequest(strategyOneRequest);

		return getS1Response(request, initialisationObjects, property, String.valueOf(l));
	}

	private void setS1Request(DataFormatter dataFormatter, ApplicationVariables applicationVariables,
			CustomerVariables customerVariables, final Row row, int m) throws IOException {
		final Cell cell = row.getCell(m);
		switch (m) {
		case 0:
			customerVariables.setMaskedCustomerID(StringUtils.isEmpty(dataFormatter.formatCellValue(cell)) ? ""
					: dataFormatter.formatCellValue(cell)); // custaccinfo -->
			// customerID
			break;
		case 3:
			applicationVariables.setApplicationDate(StringUtils.isEmpty(dataFormatter.formatCellValue(cell)) ? ""
					: dataFormatter.formatCellValue(cell)); // planinfo -->
			// Application
			// Date
			break;
		case 4:
			customerVariables.setClientBirthDate(StringUtils.isEmpty(dataFormatter.formatCellValue(cell)) ? ""
					: dataFormatter.formatCellValue(cell)); // personaldetail -->
			// birth_Date

			break;
		case 5:
			applicationVariables.setMainOfferName(StringUtils.isEmpty(dataFormatter.formatCellValue(cell)) ? ""
					: dataFormatter.formatCellValue(cell)); // planinfo --> selectedPlan
			break;
		case 6:
			applicationVariables
					.setWithHandSetInd(Double.parseDouble(StringUtils.isEmpty(dataFormatter.formatCellValue(cell)) ? "0"
							: dataFormatter.formatCellValue(cell))); // planinfo --> withHandset
			break;
		case 7:
			applicationVariables
					.setAppliedAmount(Double.valueOf(StringUtils.isEmpty(dataFormatter.formatCellValue(cell)) ? ""
							: dataFormatter.formatCellValue(cell))); // planinfo -->
			// selectedPlanAmount
			break;
		case 8:
			applicationVariables.setScenario(StringUtils.isEmpty(dataFormatter.formatCellValue(cell)) ? ""
					: dataFormatter.formatCellValue(cell)); // scenario
			break;
		case 9:
			customerVariables.setPoid(StringUtils.isEmpty(dataFormatter.formatCellValue(cell)) ? ""
					: dataFormatter.formatCellValue(cell)); // poidchk
			// -->
			// proofOfIdentificationType
			break;
		case 10:
			applicationVariables.setSalesChannel(StringUtils.isEmpty(dataFormatter.formatCellValue(cell)) ? ""
					: dataFormatter.formatCellValue(cell)); // channel --> dafSource
			break;
		case 11:
			applicationVariables.setTpaName(StringUtils.isEmpty(dataFormatter.formatCellValue(cell)) ? ""
					: dataFormatter.formatCellValue(cell)); // tpaName
			break;
		case 12:
			applicationVariables.setTerritory(StringUtils.isEmpty(dataFormatter.formatCellValue(cell)) ? ""
					: dataFormatter.formatCellValue(cell)); // territory
			break;
		case 13:
			applicationVariables
					.setPostalCode(Double.valueOf(StringUtils.isEmpty(dataFormatter.formatCellValue(cell)) ? ""
							: dataFormatter.formatCellValue(cell))); // addbillinfo
			// -->billingZipCode
			break;
		case 14:
			customerVariables
					.setgCashScore(Double.parseDouble(StringUtils.isEmpty(dataFormatter.formatCellValue(cell)) ? "0"
							: dataFormatter.formatCellValue(cell))); // eligibilitychk -->
			// gScore
			break;
		}
	}

	public Date getDate(String SDate) {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = formatter.parse(SDate);
		} catch (ParseException e) {
			LOGGER.debug("Date is: " + date);
		}
		return date;
	}

	public List<S1Response> getS1Response(S1Request reqS1Request, List<S1Response> initialisationObjects,
			PropertyHandler property, String inquiryCode) throws IOException {
		GlobeStrategyOneService globeStrategyOneService = new GlobeStrategyOneService();
		return globeStrategyOneService.processStrategyOneRequest(reqS1Request, true, initialisationObjects, property,
				inquiryCode);

	}

	public void writeS1ResponseExcel(List<S1Response> response, int row, String resPath, String s1ExcelSheet)
			throws InvalidFormatException, IOException {
		S1ResponseService responseService = new S1ResponseService();

		FileOutputStream out = new FileOutputStream(new File(resPath));
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet(s1ExcelSheet);
		responseService.writeHeaderLine(sheet, workbook, out);
		responseService.writeDataLines(sheet, workbook, response, out, row);
		responseService.writeS1Response(workbook, sheet, out);

	}
}
