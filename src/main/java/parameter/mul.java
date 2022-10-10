package parameter;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mul {
	@Test  
	@Parameters({"browser"})  
	public void mul1(String brows)  
	{  
	System.out.println("enter the browser");
	Scanner sc=new Scanner(System.in);
	String browser1=sc.nextLine();
	if(browser1.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(); 
	}
	}
}
