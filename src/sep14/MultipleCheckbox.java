package sep14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/checkbox_1.html");
		//get collection of  checkboxs 
		List<WebElement>allcheckboxs=driver.findElements(By.tagName("input"));
		System.out.println("no of checkboxes::::"+allcheckboxs.size());
		for (WebElement each : allcheckboxs) {
			//verify checkbox  true or false
			boolean flag=each.isSelected();
			
			//print each checkbox which is stored into value property
			String checkboxname=each.getAttribute("value");
			System.out.println(checkboxname+"\n"+flag);
			if (flag) {
				each.click();
				Thread.sleep(5000);
			}
			
			else {
				each.click();
			}
		}
          
	
}
	}


