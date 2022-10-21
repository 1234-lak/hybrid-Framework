package sep8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleandUrl {

	public static void main(String[] args) throws Throwable {
		// create an instance object
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url
		driver.get("http://amazon.in");
		Thread.sleep(5000);
		String pagetitle=driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		String strurl=driver.getCurrentUrl();
		System.out.println(strurl);
		System.out.println(strurl.length());
		driver.close();
		

	}

}
