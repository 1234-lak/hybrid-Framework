package sep21;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrageTableSize {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		//store webtable into webelement
		WebElement webtable=driver.findElement(By.id("resultTable"));
		//get collection of rows in a table which stored tag tr
		List<WebElement> rows=webtable.findElements(By.tagName("tr"));
		System.out.println("No of rows are:::"+rows.size());
		//iterate all rows
		for (int i = 1; i < rows.size(); i++) {
			//get collection of cells in each row
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			Thread.sleep(5000);
			System.out.println("Row number"+i+"   "  +"colonm size::" +cols.size()); 
		}
			
		}

	}


