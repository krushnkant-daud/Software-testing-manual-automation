package seleniumWebdriver;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcleFile {
	
	public static void main(String[] args) throws Exception {
//		
//		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\TestDataFile.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook();
//		XSSFSheet sheet = workbook.createSheet("Test-Data");
//		XSSFRow row1 = sheet.createRow(0);
//		row1.createCell(0).setCellValue("hey");
//		row1.createCell(1).setCellValue(1234);
//		row1.createCell(2).setCellValue(true);
//		
//		XSSFRow row2 = sheet.createRow(1);
//		row2.createCell(0).setCellValue("hii");
//		row2.createCell(1).setCellValue("Hello");
//		row2.createCell(2).setCellValue("Automation-testing");
//		
//		
//		XSSFRow row3 = sheet.createRow(2);
//		row3.createCell(0).setCellValue("hii");
//		row3.createCell(1).setCellValue("Hello");
//		row3.createCell(2).setCellValue("Automation-testing");
//		
//		workbook.write(file);
//		file.close();
//		workbook.close();
//		System.out.println("File is writen");
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\selenium\\testdata\\fileIO.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Test-Data");
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("hey");
		row1.createCell(1).setCellValue(1234);
		row1.createCell(2).setCellValue(true);
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("hii");
		row2.createCell(1).setCellValue("Hello");
		row2.createCell(2).setCellValue("Automation-testing");
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("hii");
		row3.createCell(1).setCellValue("Hello");
		row3.createCell(2).setCellValue("Automation-testing");

		workbook.write(file);
		file.close();
		workbook.close();
		System.out.println("File is writen");
		
	}
}
