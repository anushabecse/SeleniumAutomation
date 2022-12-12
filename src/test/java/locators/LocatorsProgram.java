package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsProgram {
	
	@Test
	public void login() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("Email")).clear();
		
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		Thread.sleep(4000);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		Thread.sleep(4000);
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(4000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
		
	}

}
