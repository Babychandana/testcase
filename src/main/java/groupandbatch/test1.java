package groupandbatch;

import org.testng.annotations.Test;

public class test1 {
@Test(groups= {"group1","group2"})
public void test()
{
	
}
@Test(groups= {"group1"})
public void test2()
{
	
}
@Test(groups= {"group2"})
public void test3()
{
	
}
}
