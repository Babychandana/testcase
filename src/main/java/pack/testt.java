package pack;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testt {

		// TODO Auto-generated method stub
	@BeforeTest
	public void open()
	{
		Reporter.log("open ",true);
	}
	@AfterTest
	public void close()
	{
		Reporter.log("close ",true);
	}

	@BeforeClass
	public void openbr()
	{
		Reporter.log("open browser",true);
	}
	@AfterClass
	public void closebr()
	{
		Reporter.log("close browser",true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("Logout",true);
	}
	@Test
	public void editcustomer()
	{
		Reporter.log("editcustomer",true);
	}
	@Test
	public void registercustomer()
	{
		Reporter.log("registercustomer",true);
	}
	@Test(priority = 1)
	public void deletecustomer()
	{
		Reporter.log("deletecustomer",true);
	}
	@Test(priority = 1)
	public void createcustomer()
	{
		Reporter.log("createcustomer",true);
	}
	

}
