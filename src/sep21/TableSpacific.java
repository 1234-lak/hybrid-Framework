package sep21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSpacific {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		String tabletext1=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[1]")).getText();
		String tabletext2=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[2]/td[2]")).getText();
		System.out.println( tabletext1 +" \n  "+tabletext2);

	}

}
