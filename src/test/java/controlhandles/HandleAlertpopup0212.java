package controlhandles;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlertpopup0212 {
	
	@Test
	public void verifyAlert() throws InterruptedException
	{
//		 WebDriverManager.chromedriver().create();
		 
		 WebDriver driver;
		 driver =new ChromeDriver();
		 
		 driver.get("http://www.uitestpractice.com/Students/Switchto");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(4000);
		 
		 driver.findElement(By.xpath("//button[contains(text(),'Launch modal')]")).click();
		 Thread.sleep(3000);
//		 
//		 Alert simpleAlert = driver.switchTo().alert();
//		 simpleAlert.getText();
//		 System.out.println("Text is "+simpleAlert.getText());
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
