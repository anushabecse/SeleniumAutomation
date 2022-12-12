package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ModelAlertJavaScript03Dec {
	WebDriver driver;
	@BeforeTest
	
	public void loginURL() throws InterruptedException
	{
		
		 driver =new ChromeDriver();
		 
		 driver.get("http://www.uitestpractice.com/Students/Switchto");
//		 driver.manage().window().maximize();
		 
		 Thread.sleep(4000);
	}

	@AfterTest
	public void logout()
	{
		driver.close();
	}
	@Test
	public void launchmodal() throws InterruptedException
	{

		JavascriptExecutor js = (JavascriptExecutor) driver ;
		 //js.executeScript("Hello  is an alert");
		 
		 WebElement launchmodal =driver.findElement(By.xpath("//button[contains(text(),'Launch modal')]"));
		 
		 js.executeScript("arguments[0].click()", launchmodal);
		 Thread.sleep(3000);
		 
		WebElement windowtext= driver.findElement(By.xpath("//h4[text()='Modal window demo']"));
		System.out.println("Window text is "+windowtext.getText());
		//modal text 
		
		WebElement modaltext = driver.findElement((By.xpath("//div[@class=\"modal-body\"]")));
		System.out.println("Modal Text is" +modaltext.getText());
		//Clcik on Ok
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		Thread.sleep(1000);
		
	}

}


