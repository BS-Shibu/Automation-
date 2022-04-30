package Automation_Project_Class.Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenWrite
{
	public static void writeData() throws Throwable 
	{
		File f =new File("C:\\Users\\HP\\OneDrive\\Documents\\DataDriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("Data").createRow(0).createCell(0).setCellValue("Username");
		wb.getSheet("Data").getRow(0).createCell(1).setCellValue("Password");
		wb.getSheet("Data").createRow(1).createCell(0).setCellValue("Alpha");
		wb.getSheet("Data").getRow(1).createCell(1).setCellValue("787&7*&*&7*");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
	}
	public static void main(String[] args) throws Throwable {
		writeData();
	}
}
