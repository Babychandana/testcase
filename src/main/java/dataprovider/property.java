package dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class property {
@DataProvider(name="com")
public static Object[][]cre() throws IOException
{
	FileInputStream fis=new FileInputStream("./data/testdata.property");
	Properties p=new Properties();
	p.load(fis);
	String url1=p.getProperty("url");
	String un1=p.getProperty("un");
	String pwd1=p.getProperty("pwd");
	return new Object[][] {{url1,un1,pwd1}};
}

@Test(dataProvider = "com")
public void tt(String url, String un, String pwd)
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).clear();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	driver.findElement(By.xpath("//input[@name='pwd']")).clear();
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();

}
}
