package controlhandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBox0112 {
	
	
	@Test
	public void verifyCheckBox() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://only-testing-blog.blogspot.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@value='Boat']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("//@[value='Car']")).click();
		Thread.sleep(1000);
		
//		//click on radiobutton
//		driver.findElement(By.xpath("//*[@value=\"male\"]")).click();
//		Thread.sleep(2000);
//		//select values from dropdown
//		
//		WebElement countrylist =driver.findElement(By.xpath("//select[@name=\"FromLB\"]"));
//		Select sel =new Select(countrylist);
//		System.out.println("Is listbox accept multiple selection or not "+sel.isMultiple());
//		
//		sel.selectByValue("Russia");
//		sel.selectByIndex(4);
//		sel.selectByVisibleText("Spain");
	}

}
