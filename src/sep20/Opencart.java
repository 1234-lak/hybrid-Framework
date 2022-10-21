package sep20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opencart {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("lakshmi");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("sweety");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("lakshmi@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("sweety123");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\"button[type='submit']\").click()" );
		Thread.sleep(5000);

	}

}
