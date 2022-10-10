package parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sub {
	@Test  
	@Parameters({"a","b"})  
	public void subb(int c, int d)  
	{  
	int subtract=c-d;  
	System.out.println("Subtraction of two numbers : "+subtract);  
	}
}
