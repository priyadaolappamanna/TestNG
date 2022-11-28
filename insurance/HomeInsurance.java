package insurance;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class HomeInsurance {
	
	@BeforeGroups("SMK")
	public void Bfrgp()
	{
		System.out.println("Printing before group");
	}
	@AfterGroups("SMK")
	public void Aftrgp()
	{
		System.out.println("Printing after group");
	}
	@Test 
	public void MobileLoginforH()
	{
		System.out.println("Home insurance- Mobile login");
	}
	
	@Test (groups= {"SMK"})
	public void MobileOutforH()
	{
		System.out.println("Home insurance- Mobile logout");
	}
	@Test
	public void WebLoginforH()
	{
		System.out.println("Home insurance- Web login");
	}
	@Test (groups= {"SMK"})
	public void WebOutforH()
	{
		System.out.println("Home insurance- Web Logout");
	}
	
	
}
