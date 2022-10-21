package sep21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablesize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//store table into web element
		WebElement webtable=driver.findElement(By.className("dataTable"));
		//get collection of rows in a table which are stored into  a tag tr 
		List<WebElement> rows=webtable.findElements(By.tagName("tr"));
		int row=rows.size()-1;
		System.out.println(" No of rows are::: "+row);
		//iterate all rows
		for (int i = 1; i < rows.size(); i++) {
			//get cell collection in each row
			List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
			Thread.sleep(5000);
			System.out.println(" row number "+i+"     "+"colonm size:::"+cols.size());
			
			
		}
		
		Thread.sleep(5000);
		driver.close();
		

	}

}
