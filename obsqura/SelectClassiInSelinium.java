package obsqura;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassiInSelinium {

	public static void main(String[] args)  {
		WebDriver driver = WebDriverManager.chromedriver().create(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		WebElement Staticdrop = driver.findElement(By.id("single-input-field"));
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//option[@value='Red']")).click();
		Select sele=new Select(Staticdrop);
		sele.selectByIndex(2);
		sele.selectByValue("Red");
		//Thread.sleep(3000);
		sele.deselectByVisibleText("Green");
		
				

	}

}
