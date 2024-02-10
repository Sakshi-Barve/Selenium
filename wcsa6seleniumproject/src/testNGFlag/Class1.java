package testNGFlag;


import org.testng.Assert;
import org.testng.annotations.Test;
@org.testng.annotations.Listeners
public class Class1 {
  
	@Test
	public void sum()
	{
		int sum=0, a=5, b=3;
		sum=a+b;
		System.out.println(sum);
	}
	@Test
	public void testToFail()
	{
		System.out.println("Text case has been failed");
		Assert.assertTrue(false);
	}
}
