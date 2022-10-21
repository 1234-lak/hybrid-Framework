package sep3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titlepage {

	public static void main(String[] args) throws Throwable {
		// create instance object
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://google.com");
		Thread.sleep(5000);
		String expectedTitle="google";
		String actualTitle=driver.getTitle();
		//verify actual with expected 
		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("title is matching:::" +expectedTitle+ "     "+actualTitle);
			System.out.println(expectedTitle.length());
		} 
		else {
			
			System.out.println("title is not matching:::" +expectedTitle+ "     "+actualTitle);
			
		
		

	}
Thread.sleep(5000);
driver.quit();
}
	
}
