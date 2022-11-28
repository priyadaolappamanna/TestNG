package obsqura;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDownInSelenium {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create(); 
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='select2-selection_rendered'])[1]")).click();
		
		List<WebElement> DropValues=driver.findElements(By.xpath("//li[@role='option']"));
		//iterating through the webelement
		for(WebElement opt:DropValues)
		{
			System.out.println("WebElement is"+opt+"*****This is the value"+opt.getText());
			if(opt.getText().equalsIgnoreCase("illinois"))
			{
				opt.click();
			}
		}
		
	}

}
