package sep23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenFromNotaPad {

	public static void main(String[] args) throws Throwable {
		FileReader f=new FileReader("F:/loginData");
		BufferedReader br=new BufferedReader(f);
		String str="";
		while ((str=br.readLine())!=null) {
			//java time stamp
			Date date=new Date();
			DateFormat df=new SimpleDateFormat("yyyy_MM_dd hh_mm_ss");
			String datef=df.format(date);
			//split into array variable
			String login[]=str.split(";");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://orangehrm.qedgetech.com/");
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("#txtUsername")).sendKeys(login[0]);
			driver.findElement(By.cssSelector("#txtPassword")).sendKeys(login[0]);
			driver.findElement(By.cssSelector("#btnLogin")).click();
			String expected="dashboard";
			String actual=driver.getCurrentUrl();
			if (actual.contains(expected)) {
			System.out.println("login sucesses::::"+expected+"   "+actual);	
				
			}
			else {
				File screen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screen, new File("F:/screenshot/"+datef+" "+" loginpage.png"));
				//capture error message
				String errormessage=driver.findElement(By.cssSelector("#spanMessage")).getText();
				System.out.println(errormessage+" "+expected+" "+actual);
				
				
			}
			driver.close();
		}

	}

}
