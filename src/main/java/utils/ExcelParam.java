package utils;

import java.io.IOException;

public class ExcelParam {
	
	public static Object[][] testData(String excelPath, String sheetName) throws IOException {
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		Object[][] data = new Object[rowCount-1][colCount];
		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<colCount; j++) {
				String cellData = excel.getCellStringValue(i, j);
				//System.out.println(cellData+" | ");
				data[i-1][j] = cellData;
			}
		}
		return data;
	}
	
	public static void main(String[] args) throws IOException {
	
	String projectPath = System.getProperty("user.dir");
	ExcelUtils excel = new ExcelUtils(projectPath+"/Files/Form data.xlsx", "Form1");
	excel.getCellStringValue(1, 1);
	excel.getCellStringValue(1, 2);
	}
}
