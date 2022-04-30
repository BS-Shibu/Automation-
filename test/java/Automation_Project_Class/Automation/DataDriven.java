package Automation_Project_Class.Automation;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven 
{
	public static void readParticularData() throws Throwable
	{	
		File f = new File("C:\\Users\\HP\\OneDrive\\Documents\\DataDriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if(cellType.equals(cellType.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
		else if(cellType.equals(cellType.NUMERIC)) {
			double cellValue = cell.getNumericCellValue();
			int numValue = (int)cellValue;
			System.out.println(numValue);
		}
	}
	public static void allData() throws Throwable 
	{
		File f = new File("C:\\Users\\HP\\OneDrive\\Documents\\DataDriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println("number of rows:  "+numberOfRows);
		for(int i=0; i<numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for(int j=0; j<numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if(cellType.equals(cellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				else if (cellType.equals(cellType.NUMERIC)) {
					double cellValue = cell.getNumericCellValue();
					int numValue = (int)cellValue;
					System.out.println(numValue);
				}
			}
		}	
	}
	public static void rowData() throws Throwable 
	{
		File f = new File("C:\\Users\\HP\\OneDrive\\Documents\\DataDriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		for (Cell cell : row) {
			CellType cellType = cell.getCellType();
			if(cellType.equals(cellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
			else if(cellType.equals(cellType.NUMERIC)) {
				double cellValue = cell.getNumericCellValue();
				int numValue = (int)cellValue;
				System.out.println(numValue);
			}	
		}
	}
	public static void cellData() throws Throwable 
	{
		File f = new File("C:\\Users\\HP\\OneDrive\\Documents\\DataDriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for(int i=0; i<numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			Cell cell = row.getCell(1);
			CellType cellType = cell.getCellType();
			if(cellType.equals(cellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
			else if(cellType.equals(cellType.NUMERIC)) {
				 double cellValue = cell.getNumericCellValue();
				 int numValue =(int)cellValue;
				 System.out.println(numValue);
			}
		}
	}
	public static void main(String[] args) throws Throwable {
		readParticularData();
		allData();
		System.out.println("Row Value :");
		rowData();
		System.out.println("Cell Value :");
		cellData();
	}
}

