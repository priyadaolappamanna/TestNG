package insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersInTestng {
	@Parameters({"Username", "Password"})
	@Test
	public void UsingDataProviderForLogin(String Uname, String Pword)
	{
		WebDriver driver=WebDriverManager.edgedriver().create();
		driver.navigate().to("https://www.saucedemo.com");
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(Uname);
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys(Pword);
		driver.findElement(By.id("login-button")).click();
		
			}
}
