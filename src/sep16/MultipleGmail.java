package sep16;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleGmail {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch url
		driver.navigate().to("https://accounts.google.com/");
		Thread.sleep(5000);
		//find web elements and open 3 links
		driver.findElement(By.xpath("(//a[normalize-space()='Help'])[1]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='Privacy'])[1]")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='Terms'])[1]")).click();
		
		//store all windows into arraylist
		ArrayList<String> gmi=new  ArrayList<String>(driver.getWindowHandles());
		System.out.println(gmi);
		//switch to help index number3
		driver.switchTo().window(gmi.get(3));
		//click on community
		driver.findElement(By.xpath("(//a[@aria-label='Community'])[1]")).click();
		Thread.sleep(5000);
		driver.close();
		//switch to Privacy Policy  index number 1
		driver.switchTo().window(gmi.get(1));
		String expected="Privacy Policy – Privacy & Terms – Google";
		String actual=driver.getTitle();
		if (expected.equalsIgnoreCase(actual)) {
			System.out.println("titlte is matching:::"+expected+"     "+actual);
		}
		else {
			System.out.println("titlte is  not matching:::"+expected+"     "+actual);
			Thread.sleep(5000);
			driver.close();
			//switch to terms index number 2
			driver.switchTo().window(gmi.get(2));
			driver.findElement(By.xpath("(//a[normalize-space()='Sign in'])[1]")).click();
			Thread.sleep(5000);
			driver.close();
		}
		
		
		}
	}


