package sep13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyItem {

	public static void main(String[] args) {
		String expecteditem="baby";
		boolean itemexist=false;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://amazon.in");
		Select listbox=new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement>allitems=listbox.getOptions();
		System.out.println(allitems.size());
		for (WebElement each: allitems) {
			String actualitems=each.getText();
			System.out.println(actualitems);
			if (actualitems.equalsIgnoreCase(expecteditem)) {
				itemexist=true;
				break;
			}
			
			
		}
		
            //item exist holding true/false
		if (itemexist) {
		System.out.println("item found in listbox:::"+expecteditem);	
		}
		else {
			System.out.println("item not found in listbox:::"+expecteditem);
			
		}
		driver.close();
	}

}
