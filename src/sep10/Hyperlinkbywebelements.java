package sep10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinkbywebelements {

	public static void main(String[] args) {
		// create instance object for chrome
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://rediff.com");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("no of links:::" +links.size());
		//iterate all links
		for (WebElement each : links) {
			System.out.println(each.getText());
			System.out.println(each.getAttribute("href"));
		}
		
		driver.close();

	}

}
