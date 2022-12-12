package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonWishListMouseOver {
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

	        //deleteButton.click();
	        //act.click(deleteButton).perform();
	        
	        //handle alert
	        
	        
	        //validation step
	        Assert.assertTrue(driver.getTitle().contains("Wish"));
	        
	        
	        
	        //dismiss
	        
	    }

}
