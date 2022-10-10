package dataprovider;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testdata {
	@Test
	public void testdat() throws EncryptedDocumentException, IOException
	{
		xcel excel=new xcel();
		String custName = excel.cust("createCustomer", 1, 2);
		String custName1 = excel.cust("createCustomer", 1, 3);
		String cust1 = excel.cust("createCustomer", 2, 2);
		String cust2 = excel.cust("createCustomer", 2, 3);
		for(int i=1;i<=2;i++) 
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='username']")).clear();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='pwd']")).clear();
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
			driver.findElement(By.xpath("//div[text()='Add New']")).click();
			driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
			if(i==1)
			{
			driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name' and @autocomplete='off'] ")).sendKeys(custName);
			driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description'] ")).sendKeys(custName1);
			}
			else
			{
				driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name' and @autocomplete='off'] ")).sendKeys(cust1);
				driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description'] ")).sendKeys(cust2);
			}
			driver.findElement(By.xpath("//div[text()='Create Customer'] ")).click();
			driver.close();
		}
		
	}
}
