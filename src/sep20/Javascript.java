package sep20;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) throws Throwable {
		//create object for webdriver
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//create object for javascript
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(5000);
		//print title and length of title
		String pagetitle=js.executeScript("return document.title").toString();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print url and length of url 
		String url=js.executeScript("return document.URL").toString();
		System.out.println(url);
		System.out.println(url.length());
		//print domain and length of domain
		String domain=js.executeScript("return document.domain").toString();
		System.out.println(domain);
		System.out.println(domain.length());

	}

}
