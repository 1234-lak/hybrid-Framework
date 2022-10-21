package sep11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Microsoft {

	public static void main(String[] args) throws Throwable {
		//create an instance object
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.navigate().to("http://google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Gm")).click();
		System.out.println(driver.getTitle());
			driver.navigate().back();
			System.out.println(driver.getTitle());
			driver.navigate().forward();
			System.out.println(driver.getTitle());
			driver.navigate().refresh();
		}
		
		

	}


