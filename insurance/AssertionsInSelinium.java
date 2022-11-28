package insurance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionsInSelinium {
	@Test
	public void VerifySwagLabsLoginForValidUser()
	{
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
		Assert.assertEquals(true, logo.isDisplayed());
		//Assert.assertEquals(false, false);
		
		WebElement Username= driver.findElement(By.id("user-name"));
		WebElement Password= driver.findElement(By.name("password"));
		WebElement Loginbutton =driver.findElement(By.id("login-button"));
		
		Assert.assertTrue(Username.isDisplayed(),"Username is not displayed");
		Username.click();
		Username.sendKeys("standard_user");
		
		Assert.assertTrue(Password.isDisplayed(),"Password field is not displayed");
	Password.click();
	Password.sendKeys("secret_sauce");
	
	Assert.assertTrue(Loginbutton.isDisplayed(),"Loginbutton field field is not displayed");
	Loginbutton.click();
	
	//Soft assert
	
	SoftAssert Sassert =new SoftAssert();
	Sassert.assertEquals(false, true,"Failed but will print the following steps");
	System.out.println("It is getting executed");
	System.out.println("It is getting executed");
	System.out.println("It is getting executed");
	
	
		
		
	}
	

}
