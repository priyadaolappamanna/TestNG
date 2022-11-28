package insurance;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DogInsurance {
	private static final Boolean False = null;
	@Test(priority=1)
	public void MobileLoginforD()
	{
		System.out.println("Dog insurance- Mobile login");
	}
	@Test(priority=0)
	public void MobileOutforD()
	{
		System.out.println("Dog insurance- Mobile logout");
		Assert.assertEquals(False, true);
	}
	@Test(priority=1)
	public void WebLoginforD()
	{
		System.out.println("Dog insurance- Web login");
	}
	@Test(priority=-1)
	public void WebOutforD()
	{
		System.out.println("Dog insurance- Web logout");
	}
}
