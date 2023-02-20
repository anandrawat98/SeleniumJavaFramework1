package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutils
{
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void main(String args[])
	{
		getRowcount();
		getCelldataString();
		getCelldataNumber();
		getColumncount();
	}
	public static int getRowcount()
	{
		int rowcount=0;
		try {
			workbook = new XSSFWorkbook("C:\\Users\\AnandRawat\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx");
		   sheet=workbook.getSheet("Sheet1");
			rowcount=sheet.getPhysicalNumberOfRows();
			//System.out.println("No of row count"+rowcount);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rowcount;

	}
	public static int getColumncount()
	{
		int columncount=0;
		
		try {
			workbook = new XSSFWorkbook("C:\\Users\\AnandRawat\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx");
		   sheet=workbook.getSheet("Sheet1");
			columncount=sheet.getRow(0).getPhysicalNumberOfCells();
			//System.out.println("No of column count"+columncount);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return columncount;

	}
public static String getCelldataString()
{
	String celldata=null;
	try {
		workbook = new XSSFWorkbook("C:\\Users\\AnandRawat\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx");
		 sheet=workbook.getSheet("Sheet1");
		celldata= sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(celldata);
	} catch (IOException e) {
		e.printStackTrace();
	}
	return celldata;
	 
}
public static void getCelldataNumber()
{
	try {
		workbook = new XSSFWorkbook("C:\\Users\\AnandRawat\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx");
		 sheet=workbook.getSheet("Sheet1");
		double celldata= sheet.getRow(1).getCell(1).getNumericCellValue();
		System.out.println(celldata);
	} catch (IOException e) {
		e.printStackTrace();
	}
	 
}
}
