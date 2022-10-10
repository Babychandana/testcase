package dataprovider;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class data {

@DataProvider(name="auth")
public static Object[][]cre()
{
	return new Object[][] {{"admin","manager"}};
}
@Test(dataProvider = "auth")
public void tt(String un, String pwd)
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='username']")).clear();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	driver.findElement(By.xpath("//input[@name='pwd']")).clear();
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();

}
}
