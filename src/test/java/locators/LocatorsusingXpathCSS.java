package locators;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadDataURLConfig;

public class LocatorsusingXpathCSS {
	
	@Test
	public void veriflogin() throws InterruptedException, IOException
	{
		ReadDataURLConfig rdf = new ReadDataURLConfig();
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.get(rdf.getNOPURL());
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys(rdf.getNOPUsername());
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name=\"Password\"]")).clear();
		driver.findElement(By.cssSelector("input[name=\"Password\"]")).sendKeys(rdf.getNOPPassowrd());
		
		Thread.sleep(4000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(4000);
		System.out.println("Title is "+driver.getTitle());
		System.out.println("Current url is "+driver.getCurrentUrl());
		//Navigate to customer
		//driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a")).click();
		//updated xpath
		driver.findElement(By.xpath("//a[@href=\"#\"]//child::p[contains(text(),\"Customers\")]")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p")).click();
		driver.findElement(By.xpath("//a[@href=\"/Admin/Customer/List\"]//child::p[contains(text(),'Customers')]")).click();
		
		
		Thread.sleep(4000);
	}

}
