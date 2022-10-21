package sep21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotleTable {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//store table into webelement
		WebElement webtable=driver.findElement(By.className("dataTable"));
		//get collection of rows in a table which are stored into tag tr
		List<WebElement> rows=webtable.findElements(By.tagName("tr"));
		System.out.println("No of rows are :::"+rows.size());
		//iterate all rows
		for (WebElement eachrow : rows) {
			//get collection of cells in each row
			List<WebElement> cols=eachrow.findElements(By.tagName("td"));
			for (WebElement eachcell : cols) {
				String celldata=eachcell.getText();
				System.out.print("\n"+celldata);
				
			}
			System.out.println();
			System.out.println("================================");
		}
		
	}

}
