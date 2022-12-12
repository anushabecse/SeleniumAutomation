package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToFrame03Dec {
	WebDriver driver = WebDriverManager.chromedriver().create();
	@BeforeTest
	
	public void launchurl() throws InterruptedException
	{
		System.out.println("Launching URL");
		
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
	}
	@AfterTest
	
	public void closingURL()
	{
		System.out.println("Closing URL");
		driver.close();
	}

	@Test
	public void SwitchToFrame() throws InterruptedException
	{
		//framexpath
		WebElement frame1 =driver.findElement(By.xpath("//iframe[@name=\"packageFrame\"]"));
		driver.switchTo().frame(frame1);
		
		//Action Element Xpath
		WebElement actionele =driver.findElement(By.xpath("//a[text()='Actions']"));
		actionele.click();
		Thread.sleep(2000);
		
		//Switch to defaultcontent before switching to another frame
		driver.switchTo().defaultContent();
		
		///click on perfrom action, it is another frame
		
		WebElement frame3 =driver.findElement(By.xpath("//iframe[@name =\"classFrame\"]"));
		
		driver.switchTo().frame(frame3);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//code[text()='perform()']")).click();;
		
		
		
	}
}
