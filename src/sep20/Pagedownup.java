package sep20;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagedownup {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		//create object for javascript
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//scroll top to bottom vertically
		js.executeScript("window.scrollTo(0,document.body.scrollHeight )");
		Thread.sleep(5000);
		//scroll bottom to top
		js.executeScript("window.scrollTo(document.body.scrollHeight ,0)");
		Thread.sleep(5000);
		driver.close();
		

	}

}
