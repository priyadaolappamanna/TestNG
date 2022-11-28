package insurance;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsInSelenium {
	public void AlertSele() {
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https//w3schools.com/jsref,asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		
		
		
		
	}

}
