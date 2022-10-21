package sep22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableValidation {

	public static void main(String[] args) throws Throwable {
		String expectedcountry="canada";
		boolean itemexist=false;
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		WebElement webtable=driver.findElement(By.id("customers"));
		List<WebElement> rows=webtable.findElements(By.tagName("tr"));
		System.out.println( "No of rows are:::"+rows.size());
		Thread.sleep(5000);
		//iterate all rows 
		for (int i = 1; i < rows.size(); i++) {
			//get collection of colonm 
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
			//iterate all coloms
			for (int j = 0; j < cols.size(); j++) {
				String actualdata=cols.get(j).getText();
				Thread.sleep(5000);
				System.out.println(actualdata+"\n");
				if (actualdata.equalsIgnoreCase(expectedcountry)) {
					itemexist=true;
					System.out.println(expectedcountry+"     "+"row no"+i+" "+"colom no::"+(j+1));
					break;
					
				}
			}
			System.out.println();
			System.out.println("=======================================");
		}
		
		if (itemexist) {
			System.out.println(expectedcountry+"  "+ " country found in table");
}
		else {
			System.out.println(expectedcountry+"  "+ " country not found in table");
		}
		Thread.sleep(5000);
		driver.close();
		}
	}


