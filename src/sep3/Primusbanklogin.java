package sep3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Primusbanklogin {

	public static void main(String[] args) throws Throwable {
		//create an object for chrome
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //launch url
        driver.get("http://primusbank.qedgetech.com/");
        //suspend tool for 5secondss
        Thread.sleep(5000);
        WebElement unm =driver.findElement(By.id("txtuId"));
             unm.clear();
        unm.sendKeys("Admin");
        String eunm=unm.getAttribute("value");
        System.out.println(eunm);
        WebElement psw=driver.findElement(By.id("txtPword"));
        
             psw.clear();
        psw.sendKeys("Admin");
        String epsw=psw.getAttribute("value");
        System.out.println(epsw);
        driver.findElement(By.id("login")).click();
        //driver.findElement(By.id("login")).sendKeys("keys.ENTER");
        Thread.sleep(5000);
        driver.close();
        
        
        
        
      
        
	}

}
