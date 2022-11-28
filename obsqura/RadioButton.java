package obsqura;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	@Test
	public void VerifyRadioButton() {
		//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\user\\\\Driver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		driver.findElement(By.name("inlineRadioOptions")).click();
		driver.findElement(By.id("button-one")).click();
		WebElement m = driver.findElement(By.id("message-one"));
		String expectedMessage = m.getText();
		
		Assert.assertTrue(expectedMessage.equals("Radio button 'Male' is checked"));
		
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.id("button-one")).click();
		WebElement f = driver.findElement(By.id("message-one"));
		String newMessage = f.getText();
		Assert.assertTrue(newMessage.equals("Radio button 'Female' is checked"));
		
		driver.findElement(By.id("inlineRadio11")).click();
		driver.findElement(By.id("inlineRadio22")).click();
		driver.findElement(By.id("button-two")).click();
		
		
		
	}

}
