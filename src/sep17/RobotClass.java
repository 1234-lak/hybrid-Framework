package sep17;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {

	public static void main(String[] args) throws Throwable {
		// create object for chrome
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch url
		driver.navigate().to("https://google.com");
		Thread.sleep(5000);
		//create object for actions class
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
		//create object for robot
		Robot r=new Robot();
		Thread.sleep(5000);
		//press down arrow for two times
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//store allwindows into arraylist
		ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
		//click create account button in child gmail window
		driver.switchTo().window(brw.get(1));
		Thread.sleep(5000);
		
		ac.moveToElement(driver.findElement(By.xpath("(//span[@class='laptop-desktop-only'][normalize-space()='Create an account'])[1]"))).click().perform();
		driver.close();
		//switch to parent window and click on sigin
		driver.switchTo().window(brw.get(0));
		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Sign in']"))).click().perform();
		Thread.sleep(5000);
		driver.close();
	}	
}

