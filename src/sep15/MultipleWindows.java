package sep15;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		//get parent window id
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		//open 3 new links open in new tabs
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		//get collection of all windows ids
		Set<String> allwins=driver.getWindowHandles();
		System.out.println(allwins);
		//iterate all windows
		for (String each : allwins) {
			//parent window should not be equal to child window
			if (!parent.equals(each)) {
				//switch to child window and get id
				String childtitle=driver.switchTo().window(each).getTitle();
				System.out.println(childtitle);
				Thread.sleep(5000);
				driver.close();
			}
		}
		//switch to parent
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("lakshmisri.attuluri@gmail.com");
		
		
			
			
			
			
			
		

	}

}
