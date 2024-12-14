package seleniumWebdriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynaminTable1 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");
		driver.manage().window().maximize();
		
//		for(int i = 1; i <= 5 ; i++) {
//			String headling = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th["+i+"]")).getText();
//			System.out.print(headling + "  --  ");

//			for(int j = 1; j <= 5; j++) {
//			String data =driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[1]/td["+i+"]")).getText();
//			String data1 =driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[2]/td["+i+"]")).getText();
//			System.out.println(data + "  --  " + data1);
//			}
//		}
//		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Category ID");
		list.add("Category Name");
		list.add("Created At");
		list.add("Modified At");
		list.add("Actions");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list);
		}
		
	}
}
