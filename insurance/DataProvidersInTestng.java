package insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvidersInTestng {
	@Test(dataProvider="GetLoginDetails")
	public void UsingDataProviderForLogin(String Uname, String Password)
	{
		WebDriver driver=WebDriverManager.edgedriver().create();
		driver.navigate().to("https://www.saucedemo.com");
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(Uname);
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("login-button")).click();
		
			}
	@DataProvider
	public Object[][] GetLoginDetails()
	{
		Object[][] data=new Object[4][2];
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
		data[1][0]="locked_out_user";
		data[1][1]="secret_sauce";
		data[2][0]="problem_user";
		data[2][1]="secret_sauce";
		data[3][0]="performance_glitch_user";
		data[3][1]="secret_sauce";
		return data;
	}
	
	

}
