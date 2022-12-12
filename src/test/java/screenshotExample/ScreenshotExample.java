package screenshotExample;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenshotExample {
		WebDriver driver;
	 @BeforeTest
	    public void loadPage() throws Exception {
		 	driver =new ChromeDriver();
	         String url = "https://www.amazon.in/";
	         
	         driver.get(url);
	         driver.manage().window().maximize();
	         Thread.sleep(1000);
	         
	    }
	    
//	    @AfterTest
//	    public void closePage() throws Exception {
//	        Thread.sleep(5000);
//	        driver.close();
//	    }

	    @Test
	    public void AmazonWishList() throws Exception {
	        
	        
	        WebElement hellosignin = driver.findElement(By.xpath("//span[text()=\"Hello, sign in\"]"));
	        
	        WebElement wishlistele = driver.findElement(By.xpath("//span[text()=\"Create a Wish List\"]"));
	        
	        
	        //Create an Object of Actions class
	        
	        Actions act = new Actions(driver);
	       act.moveToElement(hellosignin).click(wishlistele).perform();
	       //Take Screenshot
	       
	       File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	       
	       File target = new File(".\\screenshot\\AmazonWishList.png");
	        
	        FileUtils.copyFile(screenshotFile, target);
	        
	        Thread.sleep(2000);
	        
	        //validation step
	        Assert.assertTrue(driver.getTitle().contains("Wish"));
	        
	        
	        
	        //dismiss
	        
	    }

}
