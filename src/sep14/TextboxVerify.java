package sep14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxVerify {

	public static void main(String[] args) throws Throwable {
		// create instance object for chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		//verify reenter textbox is displayed or hidden
		WebElement textbox=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		
		boolean flag=textbox.isDisplayed();
		System.out.println(flag);
		//verify radio buttons selected or not
		WebElement radiobtn=driver.findElement(By.xpath("//input[@value='1']")) ;
		boolean flag1=radiobtn.isSelected();
		System.out.println(flag1);
		radiobtn.click();
		
		
																																																																																												
		
	}

}
