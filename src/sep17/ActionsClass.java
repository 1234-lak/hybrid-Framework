package sep17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch  url
		driver.get("https://flipkart.com");
		//create object for action class
		Actions ac=new Actions(driver);
		//close login window
		ac.sendKeys(Keys.ESCAPE).perform();
		//move to mouse on fashions 
		ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"))).perform();
		Thread.sleep(5000);
		//move mouse to all and clickit
		ac.moveToElement(driver.findElement(By.linkText("All"))).click().perform();
		Thread.sleep(5000);
		//move mouse to electronics
		ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Electronics']"))).perform();
		Thread.sleep(5000);
		//move mouse to mouse link
		ac.moveToElement(driver.findElement(By.linkText("Mouse"))).click().perform();
		Thread.sleep(5000);
		driver.close();

	}

}
