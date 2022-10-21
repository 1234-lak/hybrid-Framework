package sep21;

import org.apache.xalan.xsltc.compiler.sym;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmTable {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
		String tabletext1=driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr[20]/td[2]")).getText();
		String tabletext2=driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr[20]/td[3]")).getText();
		System.out.println( tabletext1+"\n"+tabletext2);
		
	}

}
