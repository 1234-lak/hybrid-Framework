package sep13;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionListbox {

	public static void main(String[] args) {
		// create instance object for chrome
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///E:/MultiListboxHtmlpage.html");
		//store listbox into select class
		Select dropdown=new Select(driver.findElement(By.name("multiSelection")));
		boolean flag=dropdown.isMultiple();
		System.out.println(flag);
		//select 8 items in listbox
		for (int i = 0; i < 8; i++) {
			dropdown.selectByIndex(i);
		}
		
		//deselect from selection
		
		for (int j = 0; j < 8; j++) {
			 dropdown.deselectByIndex(j);
		}
		  
		
		}
		
			
		
		
		

	}


