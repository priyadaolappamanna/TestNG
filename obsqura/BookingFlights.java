package obsqura;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookingFlights {


	@Test
	public void checkFlights()  {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.booking.com/index.en-gb.html?label=gen173nr-1BCAEoggI46AdIM1gEaGyIAQGYAQm4ARfIAQzYAQHoAQGIAgGoAgO4AsvtzJsGwAIB0gIkYjI2NzI2YjYtN2Y0MS00OThhLWI0NDYtNmY1ODczZDM5NTMy2AIF4AIB&sid=85a1d08a5a19dcbbfead10b12d7ce334&keep_landing=1&sb_price_type=total&");
		driver.manage().window().maximize();
		
		WebElement flight = driver.findElement(By.xpath("//a[@class='bui-tab__link']"));
		String expectedA = "Flights";
		Assert.assertTrue(flight.isDisplayed(), "Flights is not displayed");
		flight.click();//clicking on flights option
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='InputRadio-module__field___4Jbyo'])[2]")).click();//to click one way round
		
		Select dropdown = new Select(driver.findElement(By.className("css-1k0jlfl")));  //to select economy or business class
		dropdown.selectByVisibleText("Business");//to select business class
		
		driver.findElement(By.xpath("//div[@data-testid='input_occupancy_desktop_passengers_trigger']")).click();//to change num of adults
		driver.findElement(By.xpath("//button[@data-testid='input_occupancy_modal_adults_increase']")).click();// to increase num of adults
		driver.findElement(By.xpath("//button[@data-testid='input_occupancy_modal_children_increase']")).click();// to increase num of children
		Select ageofchild = new Select(driver.findElement(By.className("InputSelect-module__field___wEAQl")));  
		ageofchild.selectByVisibleText("10");//selecting age of child
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-testid='input_occupancy_desktop_done']")).click();//clicking on done after selecting age
		
	//	Thread.sleep(3000);
		
		WebElement destination = driver.findElement(By.className("css-h71vi3-SearchboxInput"));//where to
		Assert.assertTrue(destination.isDisplayed());
		destination.click();
		
		driver.findElement(By.className("css-1tl2oa1")).sendKeys("MAA Chennai International Airport");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='css-1hhenib']")).click();//destination chennai
				
		//Thread.sleep(3000);
		
	
		driver.findElement(By.cssSelector("input[placeholder='Depart']")).click();//calender
		driver.findElement(By.xpath("//span[@data-date-cell='2022-12-24']")).click();//picking date
		driver.findElement(By.xpath("//button[@data-testid='searchbox_submit']")).click();//clicking on search
		
		//Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[@aria-controls ='CHEAPEST']")).click();//cheapest
	//	Thread.sleep(2000);
			
		
		WebElement PriceofCheapestflight = driver.findElement(By.xpath("(//div[@data-test-id = 'flight_card_price_main_price'])[1]"));
		//Thread.sleep(5000);//inspecting on rate of cheapest flight
		String lowest = PriceofCheapestflight.getText();//getting the rate
		System.out.println("The price of the Cheapest Flight is = " + lowest);
		//Thread.sleep(5000);
		
		
			
		
		
	}

}

