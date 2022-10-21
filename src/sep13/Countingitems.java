package sep13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Countingitems {

	public static void main(String[] args) {
		// create instance object for chrome
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://amazon.in");
		//store listbox into select class
		Select listbox=new Select(driver.findElement(By.id("searchDropdownBox")));
		//get collection of items in listbox
		List<WebElement> allitems=listbox.getOptions();
		System.out.println("no of items::::"+allitems.size());
		for (WebElement each : allitems) {
			System.out.println(each.getText());
			each.click();


		}
		driver.close();
	}

}
