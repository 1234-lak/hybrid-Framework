package sep13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxSelection {

	public static void main(String[] args) throws Throwable {
		// create instance object for chrome
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		//store listbox into select class
		Select listbox1=new Select(driver.findElement(By.name("birthday_day")));
		Select listbox2=new Select(driver.findElement(By.name("birthday_month")));
		Select listbox3=new Select(driver.findElement(By.name("birthday_year")));
		//verify listboxes is multiple listbox 
		boolean flag=listbox1.isMultiple();
		boolean flag1=listbox2.isMultiple();
		boolean flag2=listbox3.isMultiple();
		System.out.println(flag+"  "+flag1+"  "+flag2);
		listbox1.selectByVisibleText("25");
		System.out.println(listbox1.getFirstSelectedOption().getText());
		listbox2.selectByIndex(9);
		System.out.println(listbox2.getFirstSelectedOption().getText());
		listbox3.selectByIndex(50);
		System.out.println(listbox3.getFirstSelectedOption().getText());
		
		
		
		
		
		
		
		

	}

}
