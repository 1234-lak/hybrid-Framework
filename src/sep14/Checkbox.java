package sep14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//store checkbox into webelement
		WebElement checkbox=driver.findElement(By.name("remember"));
		//verify check box is true or false
		boolean flag=checkbox.isSelected();
		System.out.println(flag);

	}

}
