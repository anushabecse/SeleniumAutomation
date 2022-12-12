package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonlocators {
	
	@Test
	public void verifySeemore() throws InterruptedException
	{
WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//h2[contains(text(),'Get fit at home')]//parent::div//following-sibling::div[@class=\"a-cardui-footer\"]//child::a[contains(text(),'Explore now')]")).click();;
//		driver.findElement(By.xpath("//h2[contains(text(),\"Shop for your baby by age\")]//parent::div//following-sibling::div[@class=\"a-cardui-footer\"]//child::a[contains(text(),\"See more\")]")).click();
		Thread.sleep(3000);
		
		System.out.println("title is "+driver.getTitle());
		//driver.get("https://admin-demo.nopcommerce.com/login");
//		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//td[text()=\"Helen Bennett\"]//preceding-sibling::td//parent::tr//input[@type=\"checkbox\"]")).click();
//		
//		Thread.sleep(1000);
		
	}

}
