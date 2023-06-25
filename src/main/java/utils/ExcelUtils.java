package utils;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) {
		try {
			wb = new XSSFWorkbook(excelPath);
			sheet = wb.getSheet(sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int getRowCount() throws IOException {
		int rowCount = 0;
		try { 
				rowCount = sheet.getPhysicalNumberOfRows();
				System.out.println("Number of rows : " +rowCount);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowCount;
	}
	
	public int getColCount() throws IOException {
		int colCount = 0;
		try { 
				colCount = sheet.getRow(0).getPhysicalNumberOfCells();
				//System.out.println("Number of rows : " +colCount);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return colCount;
	}
	
	public String getCellStringValue(int rowNum, int colNum) throws IOException {
		String cellData = null;
		try {
				cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
				//System.out.println(cellData);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cellData;
	}
	
	public double getCellNumberValue(int rowNum, int colNum) throws IOException {
		double cellData = 0;
		try {
				cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
				System.out.println(cellData);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cellData;
	}
}
