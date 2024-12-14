package seleniumWebdriver;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcle1 {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\selenium\\testdata\\Selenium Syllabus.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		short cell = sheet.getRow(0).getLastCellNum();
		System.out.println("Total row's : " + row);
		System.out.println("Total cell's : " + cell);

		// System.out.println(sheet.getRow(1).getCell(1).toString());

		for (int r = 0; r < row; r++) {
			XSSFRow rows =sheet.getRow(r);

			for (int c = 0; c < cell; c++) {
				XSSFCell cells = rows.getCell(c);
				System.out.println(cells + "\t");
			}
			System.out.println();
		}
		
		file.close();
		workbook.close();
	}
}
