package sep10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperforgoogle {

	public static void main(String[] args) {
		// create object for chrome
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://google.com/");
		List<WebElement> totallinks=driver.findElements(By.tagName("a"));
		System.out.println("no of links:::"+totallinks.size());
		for (WebElement each : totallinks) {
			System.out.println(each.getText());
			System.out.println(each.getAttribute("href"));

		}

	}

}
