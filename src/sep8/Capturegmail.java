package sep8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturegmail {

	public static void main(String[] args) throws Throwable {
		//create instance object
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://google.com");
		Thread.sleep(5000);
		//capture gmail text in google page
		String visiable=driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(visiable);
		//capture gmail link url
		String gmailurl=driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(gmailurl);
		driver.close();
		
	}

}
