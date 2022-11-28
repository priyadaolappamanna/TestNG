package obsqura;


	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class CheckBoxDemo {
		@Test
		public void VerifyCheckboxDemo() {
			//System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\user\\\\Driver\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
			WebDriver driver = WebDriverManager.chromedriver().create(); 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Checkbox Demo")).click();
			driver.findElement(By.className("form-check-label")).click();
			WebElement check = driver.findElement(By.id("message-one"));
			String verifyCheck = check.getText();// getting the webelement text of the check variable
			Assert.assertTrue(verifyCheck.equals("Success - Check box is checked"));
			
			
			WebElement selectBox = driver.findElement(By.id("button-two"));
			selectBox.click();
			String value = selectBox.getAttribute("value");// we will get unselect all 
			//System.out.println(value);
			Assert.assertTrue(value.equals("Unselect All"));//  we are checking ifthe value equals attribute value
			selectBox.click();
			String newValue = selectBox.getAttribute("value");// attribute=value, to get the value of value attribute we use to getattribute
			Assert.assertTrue(newValue.equals("Select All"));
			
			//Thread.sleep(5000);
			driver.close();
			
			
		}

	}


