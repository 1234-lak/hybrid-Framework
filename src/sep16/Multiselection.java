package sep16;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiselection {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("https://www.irctc.co.in/nget/train-search");
		//find element and click it
		driver.findElement(By.xpath("(//button[normalize-space()='OK'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//label[contains(text(),'FLIGHTS')])[2]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'HOTELS')])[2]")).click();
		driver.findElement(By.xpath("(//label[normalize-space()='RAIL DRISHTI'])[1]")).click();
		//store all windows into arraylist
         ArrayList<String> brw=new ArrayList<String>(driver.getWindowHandles());
         System.out.println(brw);
         //switch airticket window index number3
         driver.switchTo().window(brw.get(3));
         Thread.sleep(5000);
         //select check box
         driver.findElement(By.name("ltc")).click();
         Thread.sleep(5000);
			driver.close();	
			//switch to hotels window index number2 
			driver.switchTo().window(brw.get(2));
			//verify title
			String expected="IRCTC Hotels";
			String actual=driver.getTitle();
			if (expected.equalsIgnoreCase(actual)) {
				System.out.println("title is matching:::"+expected+"   "+actual  );
			}
			else {
				System.out.println("title is not matching:::"+expected+"  "+actual);
			}
			Thread.sleep(5000);
			driver.close();
			//switch to rail index number by 1
			driver.switchTo().window(brw.get(1));
			//click on odc enquiry
			driver.findElement(By.xpath("(//h3[normalize-space()='ODC ENQUIRY'])[1]")).click();
			String expected1="Rail Drishti : Dashboard for Indian Railways";
			String actual1=driver.getTitle();
			if (expected.equalsIgnoreCase(actual)) {
				System.out.println("title is matching:::"+expected1+"   "+actual1  );
			}
			else {
				System.out.println("title is not matching:::"+expected1+"  "+actual1);
			}
			Thread.sleep(5000);
			driver.close();
	}

}
