package sep8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urlsecuirity {

	public static void main(String[] args) throws Throwable {
		//create instance object
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch  url
		driver.get("http://gmail.com");
		Thread.sleep(5000);
		String expected="https://";
		String actual=driver.getCurrentUrl();
		if (actual.startsWith(expected)) {
			
			System.out.println("url is securied::::"+expected+"      "+actual);
			
		}
		else {
			System.out.println("url is  not securied::::"+expected+"   "+actual);
		}
		driver.close();
		}
	}


