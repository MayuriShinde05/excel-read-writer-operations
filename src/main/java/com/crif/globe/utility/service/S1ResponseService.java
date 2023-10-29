package com.crif.globe.utility.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.crif.globe.utility.domain.s1.response.S1Response;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

@Service
public class S1ResponseService {

	private static final Logger LOGGER = LoggerFactory.getLogger(S1ResponseService.class);

	@Value("${com.crif.globe.s1.responseFile: E:\\Excel\\Globe_UAT_S1_Response.xlsx}")
	String responseFile;

	public S1ResponseService() {
		super();
	}

	public void writeS1Response(XSSFWorkbook workbook, XSSFSheet sheet, FileOutputStream out)
			throws InvalidFormatException, IOException {
		workbook.write(out);
		workbook.close();
		out.close();
	}

	public void writeHeaderLine(XSSFSheet sheet, XSSFWorkbook workbook, FileOutputStream out) {
		Row row = sheet.createRow(0);

		CellStyle style = workbook.createCellStyle();
		XSSFFont font = workbook.createFont();
		font.setBold(true);
		font.setFontHeight(11);
		style.setFont(font);

		createCell(row, 0, "InquiryCode", style, sheet);
		createCell(row, 1, "ProcessCode", style, sheet);
		createCell(row, 2, "OrganizationCode", style, sheet);
		createCell(row, 3, "ProcessVersion", style, sheet);
		createCell(row, 4, "LayoutVersion", style, sheet);

		createCell(row, 5, "APPPLICATIONDATE", style, sheet);
		createCell(row, 6, "APPLIEDAMOUNT", style, sheet);
		createCell(row, 7, "ASCORE", style, sheet);
		createCell(row, 8, "STRATEGYDECISION", style, sheet);
		createCell(row, 9, "RULERESULT", style, sheet);
		createCell(row, 10, "ASCORE_LEVEL", style, sheet);
		createCell(row, 11, "GCASHSCORE_LEVEL", style, sheet);
		createCell(row, 12, "CBSCORE_LEVEL", style, sheet);
		createCell(row, 13, "PRODUCT_TYPE", style, sheet);
		createCell(row, 14, "STRATEGY", style, sheet);

		createCell(row, 15, "REASONCODE", style, sheet);

		createCell(row, 16, "SCORECARD_OBJCODE", style, sheet);
		createCell(row, 17, "SCORECARD_RAW", style, sheet);
		createCell(row, 18, "SCORECARD_ALIGNED", style, sheet);
		createCell(row, 19, "SCORECARD_VAR_0", style, sheet);
		createCell(row, 20, "SCORECARD_VAR_1", style, sheet);
		createCell(row, 21, "SCORECARD_VAR_2", style, sheet);
		createCell(row, 22, "SCORECARD_VAR_3", style, sheet);
		createCell(row, 23, "SCORECARD_VAR_4", style, sheet);
		createCell(row, 24, "SCORECARD_VAR_5", style, sheet);
		createCell(row, 25, "SCORECARD_VAR_6", style, sheet);
		createCell(row, 26, "SCORECARD_VAR_VALUE_0", style, sheet);
		createCell(row, 27, "SCORECARD_VAR_VALUE_1", style, sheet);
		createCell(row, 28, "SCORECARD_VAR_VALUE_2", style, sheet);
		createCell(row, 29, "SCORECARD_VAR_VALUE_3", style, sheet);
		createCell(row, 30, "SCORECARD_VAR_VALUE_4", style, sheet);
		createCell(row, 31, "SCORECARD_VAR_VALUE_5", style, sheet);
		createCell(row, 32, "SCORECARD_VAR_VALUE_6", style, sheet);
		createCell(row, 33, "SCORECARD_VAR_RC_0", style, sheet);
		createCell(row, 34, "SCORECARD_VAR_RC_1", style, sheet);
		createCell(row, 35, "SCORECARD_VAR_RC_2", style, sheet);
		createCell(row, 36, "SCORECARD_VAR_RC_3", style, sheet);
		createCell(row, 37, "SCORECARD_VAR_RC_4", style, sheet);
		createCell(row, 38, "SCORECARD_VAR_RC_5", style, sheet);
		createCell(row, 39, "SCORECARD_VAR_RC_6", style, sheet);
		createCell(row, 40, "SCORECARD_VAR_RM_0", style, sheet);
		createCell(row, 41, "SCORECARD_VAR_RM_1", style, sheet);
		createCell(row, 42, "SCORECARD_VAR_RM_2", style, sheet);
		createCell(row, 43, "SCORECARD_VAR_RM_3", style, sheet);
		createCell(row, 44, "SCORECARD_VAR_RM_4", style, sheet);
		createCell(row, 45, "SCORECARD_VAR_RM_5", style, sheet);
		createCell(row, 46, "SCORECARD_VAR_RM_6", style, sheet);

	}

	private void createCell(Row row, int columnCount, Object value, CellStyle style, XSSFSheet sheet) {
		sheet.autoSizeColumn(columnCount);
		Cell cell = row.createCell(columnCount);
		cell.setCellValue(value.equals("") ? "NA" : (String) value);
		cell.setCellStyle(style);
	}

	public void writeDataLines(XSSFSheet sheet, XSSFWorkbook workbook, List<S1Response> responses, FileOutputStream out,
			int rowCount) {

		CellStyle style = workbook.createCellStyle();
		XSSFFont font = workbook.createFont();
		font.setFontHeight(10);
		style.setFont(font);

		for (S1Response response : responses) {
			XSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
			int columnCount = 0;

			if (Objects.nonNull(response.getStrategyOneResponse())
					&& Objects.nonNull(response.getStrategyOneResponse().getHeader())) {
				createCell(row, columnCount++, response.getStrategyOneResponse().getHeader().getInquiryCode(), style,
						sheet);
				createCell(row, columnCount++, response.getStrategyOneResponse().getHeader().getLayoutVersion(), style,
						sheet);
				createCell(row, columnCount++, response.getStrategyOneResponse().getHeader().getOrganizationCode(),
						style, sheet);
				createCell(row, columnCount++, response.getStrategyOneResponse().getHeader().getProcessCode(), style,
						sheet);
				createCell(row, columnCount++, response.getStrategyOneResponse().getHeader().getProcessVersion(), style,
						sheet);
			}
			if (Objects.nonNull(response.getStrategyOneResponse())
					&& Objects.nonNull(response.getStrategyOneResponse().getBody())
					&& Objects.nonNull(response.getStrategyOneResponse().getBody().getApplication())
					&& Objects.nonNull(response.getStrategyOneResponse().getBody().getApplication().getVariables())) {

				// APPPLICATIONDATE
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getAppplicationDate() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getAppplicationDate(),
						style, sheet);

				// APPLIEDAMOUNT
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getAppliedAmount() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getAppliedAmount(),
						style, sheet);

				// ASCORE
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables().getaScore() == null
								? ""
								: response.getStrategyOneResponse().getBody().getApplication().getVariables()
										.getaScore(),
						style, sheet);

				// STRATEGYDECISION
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getStrategyDecision() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getStrategyDecision(),
						style, sheet);

				// RULERESULT
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getRulerResult() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getRulerResult(),
						style, sheet);

				// ASCORE_LEVEL
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getAscoreLevel() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getAscoreLevel(),
						style, sheet);

				// CBSCORE_LEVEL
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getCbScoreLevel() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getCbScoreLevel(),
						style, sheet);

				// GCASHSCORE_LEVEL
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getGcashScoreLevel() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getGcashScoreLevel(),
						style, sheet);

				// PRODUCT_TYPE
				createCell(row, columnCount++,
						(response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getProductType() == null
								|| response.getStrategyOneResponse().getBody().getApplication().getVariables()
										.getProductType() == "NA") ? ""
												: response.getStrategyOneResponse().getBody().getApplication()
														.getVariables().getProductType(),
						style, sheet);

				// STRATEGY
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getStrategy() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getStrategy(),
						style, sheet);

				// REASONCODE
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getReasonCode() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getReasonCode(),
						style, sheet);

				// SCORECARD_OBJCODE
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardObjcode() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardObjcode(),
						style, sheet);

				// SCORECARD_RAW
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardRaw() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardRaw(),
						style, sheet);

				// SCORECARD_ALIGNED
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardAligned() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardAligned(),
						style, sheet);

				// SCORECARD_VAR_0
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVar0() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVar0(),
						style, sheet);

				// SCORECARD_VAR_1
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVar1() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVar1(),
						style, sheet);

				// SCORECARD_VAR_2
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVar2() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVar2(),
						style, sheet);

				// SCORECARD_VAR_3
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVar3() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVar3(),
						style, sheet);

				// SCORECARD_VAR_4
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVar4() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVar4(),
						style, sheet);

				// SCORECARD_VAR_5
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVar5() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVar5(),
						style, sheet);

				// SCORECARD_VAR_6
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVar6() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVar6(),
						style, sheet);

				// SCORECARD_VAR_VALUE_0
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarValue0() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarValue0(),
						style, sheet);

				// SCORECARD_VAR_VALUE_1
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarValue1() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarValue1(),
						style, sheet);

				// SCORECARD_VAR_VALUE_2
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarValue2() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarValue2(),
						style, sheet);

				// SCORECARD_VAR_VALUE_3
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarValue3() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarValue3(),
						style, sheet);

				// SCORECARD_VAR_VALUE_4
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarValue4() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarValue4(),
						style, sheet);

				// SCORECARD_VAR_VALUE_5
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarValue5() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarValue5(),
						style, sheet);

				// SCORECARD_VAR_VALUE_6
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarValue6() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarValue6(),
						style, sheet);

				// SCORECARD_VAR_RC_0
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarRc0() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarRc0(),
						style, sheet);

				// SCORECARD_VAR_RC_1
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarRc1() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarRc1(),
						style, sheet);

				// SCORECARD_VAR_RC_2
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarRc2() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarRc2(),
						style, sheet);

				// SCORECARD_VAR_RC_3
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarRc3() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarRc3(),
						style, sheet);

				// SCORECARD_VAR_RC_4
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarRc4() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarRc4(),
						style, sheet);

				// SCORECARD_VAR_RC_5
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarRc5() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarRc5(),
						style, sheet);

				// SCORECARD_VAR_RC_6
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarRc6() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarRc6(),
						style, sheet);

				// SCORECARD_VAR_RM_0
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarRm0() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarRm0(),
						style, sheet);

				// SCORECARD_VAR_RM_1
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarRm1() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarRm1(),
						style, sheet);

				// SCORECARD_VAR_RM_2
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarRm2() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarRm2(),
						style, sheet);

				// SCORECARD_VAR_RM_3
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarRm3() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarRm3(),
						style, sheet);

				// SCORECARD_VAR_RM_4
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarRm4() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarRm4(),
						style, sheet);

				// SCORECARD_VAR_RM_5
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarRm5() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarRm5(),
						style, sheet);

				// SCORECARD_VAR_RM_6
				createCell(row, columnCount++,
						response.getStrategyOneResponse().getBody().getApplication().getVariables()
								.getScorecardVarRm6() == null ? ""
										: response.getStrategyOneResponse().getBody().getApplication().getVariables()
												.getScorecardVarRm6(),
						style, sheet);

			}

		}
	}
}
