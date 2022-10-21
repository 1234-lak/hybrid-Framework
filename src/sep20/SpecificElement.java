package sep20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificElement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//create javascript object
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(5000);
		//store facebook link
		
		WebElement facebooklink=driver.findElement(By.linkText("Facebook"));
		Thread.sleep(5000);
		//scroll to particular element in eb page
		js.executeScript("document.scrollIntoView", facebooklink);
		Thread.sleep(5000);
		facebooklink.click();
		
}

}
