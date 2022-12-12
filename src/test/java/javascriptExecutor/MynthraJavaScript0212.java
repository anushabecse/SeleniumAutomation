package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MynthraJavaScript0212 {
	WebDriver driver;
@BeforeTest
	
	public void loginURL() throws InterruptedException
	{
		
		 driver =new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
//		 driver.manage().window().maximize();
		 
		 Thread.sleep(4000);
	}

//	@AfterTest
//	public void logout()
//	{
//		driver.close();
//	}
	
	@Test
	
	public void ScrollView() throws InterruptedException
	{
		WebElement sellamzon =driver.findElement(By.xpath("//a[contains(text(),\"Sell on Amazon\")]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", sellamzon);
		Thread.sleep(1000);
		sellamzon.click();
		Thread.sleep(1000);
		System.out.println("Title is "+driver.getTitle());
		System.out.println("Current url is"+driver.getCurrentUrl());
	}

}
