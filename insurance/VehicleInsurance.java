package insurance;

import org.testng.annotations.Test;

public class VehicleInsurance {
	@Test(enabled=true, priority=1)
	public void MobileLoginforV()
	{
		System.out.println("Vehicleinsurance- Mobile login");
	}
	@Test(dependsOnMethods= {"WebOutforV"}, priority=2)
	public void MobileOutforV()
	{
		System.out.println("Vehicle insurance-Mobile logout");
	}
	@Test(enabled=true, priority=3)
	public void WebLoginforV()
	{
		System.out.println("Vehicle insurance- Web login");
	}
	@Test(dependsOnMethods= {"WebLoginforV"}, priority=4)
	public void WebOutforV()
	{
		System.out.println("Vehicle insurance-Web logout");
	}
}
