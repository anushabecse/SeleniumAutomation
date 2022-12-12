package controlhandles;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PromptAlert {
	
	@Test
	public void verifyPromptAlert() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://only-testing-blog.blogspot.com/");
		driver.findElement(By.xpath("//button[contains(text(),\"Show Me Prompt\")]")).click();
		Thread.sleep(4000);
		
		Alert prmtmsg = driver.switchTo().alert();
		System.out.println("Alert message is "+prmtmsg.getText());
		
		//Validation
		Assert.assertEquals(prmtmsg.getText(),"Your Name Please");
		Assert.assertTrue(prmtmsg.getText().contains("Name please"));
		prmtmsg.sendKeys("Anush");
		prmtmsg.accept();
		
	}

}
