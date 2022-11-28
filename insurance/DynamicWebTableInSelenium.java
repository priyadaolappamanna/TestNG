package insurance;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class DynamicWebTableInSelenium {
	@Test
	public void DynamicWebTbInSele()
	{
		WebDriver driver=WebDriverManager.edgedriver().create();
		driver.get("https://money.rediff.com/indices");
		driver.manage().window().maximize();
		
		//clicking on show more
		driver.findElement(By.id("showMoreLess")).click();
		
		//getting the number of rows
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"dataTable\"]/tbody/tr"));
		int rowsize=rows.size();// getting the row size
		System.out.println("The number of rows are:   "+rowsize);//printing the number of rows
		
		//getting the number of columns
		List<WebElement> col=driver.findElements(By.xpath("//*[@id=\"dataTable\"]/tbody/tr[1]/td"));
		int colsize=col.size();// getting the column size
		System.out.println("The number of columns are:   "+colsize);//printing the number of columns
		
		
		//iterating through rows and colums and fetching the values of rows and columns	
		for (int i=1;i<=rowsize;i++)
		{
			
			for (int j=1;j<=colsize;j++)
			{
				
				System.out.print(driver.findElement(By.xpath("//*[@id='dataTable']/tbody/tr["+ i +"]/td["+ j +"]")).getText()+ "  ");
				
			}
			System.out.println();
		}
		
		System.out.println();
		WebElement table= driver.findElement(By.tagName("table"));
		//to find the second row of the table
		WebElement tablerow=table.findElement(By.xpath("//*[@id=\"dataTable\"]/tbody/tr[2]"));
		String rowvalue=tablerow.getText();
		System.out.println("Second row is "+rowvalue);
		
		//to print 4th column of 3rd row
		WebElement tablecol=tablerow.findElement(By.xpath("//*[@id=\"dataTable\"]/tbody/tr[3]/td[4]"));
		String colvalue=tablecol.getText();
		System.out.println("4th col of 3rd row is "+colvalue);
	}
	}


