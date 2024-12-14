package seleniumWebdriver;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excle file--->workbook(xssfWorkbook)--->sheets(xssfsheet)--->row(xssfRow)--->cell(xssfCell)

public class ReadingExcleFile {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\selenium\\testdata\\Selenium Syllabus.xlsx");
	
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int row = sheet.getLastRowNum();
		short cell = sheet.getRow(1).getLastCellNum();
		System.out.println("Total row's are : " + row);
		System.out.println("Total cell's are : " + cell);
		
		System.out.println(sheet.getRow(1).getCell(3).getStringCellValue());
		
		
//		for(int i = 0; i < row; i++) {
//			XSSFRow rows = sheet.getRow(i);
//			
//			for(int j = 0; j < cell; j++) {
//				XSSFCell cells = rows.getCell(j);
//				System.out.println(cells.toString());
//			}
//			System.out.println();
//		}
		file.close();
		workbook.close();
	}

}
