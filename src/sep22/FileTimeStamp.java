package sep22;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileTimeStamp {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		//java time stamp
		Date date=new Date();
		DateFormat df=new SimpleDateFormat("yyyy_MM_dd hh-mm-ss");
		String datef=df.format(date);
		//take screenshot and stored into variable
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy screenshot into local system
		FileUtils.copyFile(screen, new File("C:/Screenshot/" +datef+""+"homepage.png" ));

	}

	

}
