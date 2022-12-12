package locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MainTestUsingTestNG extends LoginTest {
	
	@Test
	
	public void verifyLogin() throws InterruptedException
	{
		System.out.println("Login test case");
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
		System.out.println(" after login title is "+ driver.getTitle());
		//Click on customer link"
		driver.findElement(By.xpath("//a[@href=\"#\"]//child::p[contains(text(),\"Customers\")]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href=\"/Admin/Customer/List\"]//child::p[contains(text(),\"Customers\")]")).click();
		Thread.sleep(4000);
		
	}

}
