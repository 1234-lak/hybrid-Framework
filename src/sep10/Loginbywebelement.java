package sep10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginbywebelement {

	public static void main(String[] args) throws Throwable {
		//create instance object for chrome
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch Url
		driver.get("http://orangehrm.qedgetech.com");
		Thread.sleep(5000);

		WebElement unm=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		unm.clear();
		unm.sendKeys("Admin");
		//capture user name value
		String eunm=unm.getAttribute("value");
		System.out.println(eunm);
		WebElement psw=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		psw.clear();
		psw.sendKeys("Qedge123!@#");
		//capture password value
		String epsw=psw.getAttribute("value");
		System.out.println(epsw);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();
		//verify actual url contains expected text
		String Expected="dashboard";
		String Actual=driver.getCurrentUrl();
		if (Actual.contains(Expected)) {
			System.out.println("login sucess::"+Expected+" "+Actual);
		}

		else {
			//capture error message
			String errormessage=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
			System.out.println(errormessage);



		}

		driver.close();



    		 
    		
     
        
	}
 
}
