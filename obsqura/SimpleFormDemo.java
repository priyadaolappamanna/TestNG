package obsqura;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleFormDemo {
	@Test
	public void VerifyMessage()  {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement Message = driver.findElement(By.id("single-input-field"));
		Assert.assertTrue(Message.isDisplayed(), "Message is not displayed");
		Message.click();
		String name = "Priyada";
		Message.sendKeys(name);
		
		WebElement ShowMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		Assert.assertTrue(ShowMessage.isDisplayed(), "Show Message is not displayed");
		ShowMessage.click();
		
		WebElement strMessage = driver.findElement(By.id("message-one"));
		String s = strMessage.getText();// your message : priyada will be printed here and saved to string s
		
		
		
		String message = s.replace("Your Message : ", "");//replacing it will null or blank to get priyda
		
		
		Assert.assertTrue(message.equals(name));
		
		
		
		WebElement ValueA = driver.findElement(By.id("value-a"));
		ValueA.click();
		ValueA.sendKeys("20");
		WebElement ValueB = driver.findElement(By.id("value-b"));
		ValueB.click();
		ValueB.sendKeys("30");
		String expectedResult = "50";
		driver.findElement(By.id("button-two")).click();
		WebElement result = driver.findElement(By.id("message-two"));
		String r = result.getText();
		String a= r.replace("Total A + B : ", "");
		Assert.assertTrue(a.equals(expectedResult));
		//Thread.sleep(5000);
		
	}

}