package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop0412_1 {
	
WebDriver driver;
    
    @BeforeTest
    public void loadPage() throws Exception {
         String url = "https://www.globalsqa.com/demo-site/draganddrop/";
         driver = WebDriverManager.chromedriver().create();
         driver.get(url);
         driver.manage().window().maximize();
         Thread.sleep(1000);
         
    }
    
//    @AfterTest
//    public void closePage() throws Exception {
//        Thread.sleep(5000);
//        driver.close();
//    }

    @Test
    public void DragAndDropOperations() throws Exception {
        
        
        WebElement photoframe = driver.findElement(By.xpath("//iframe[contains(@data-src,'photo')]"));
        driver.switchTo().frame(photoframe);
        
        WebElement img3 =driver.findElement(By.cssSelector("img[src*='tatras3']"));
        
        WebElement img4 = driver.findElement(By.cssSelector("img[src*='tatras4']"));
        WebElement trash = driver.findElement(By.cssSelector("div#trash"));
        
        Actions act =new Actions(driver);
        act.dragAndDrop(img3, trash).perform();
        Thread.sleep(5000);
      //app2
        //A convenience method that performs click-and-hold at the location of the source element, 
        //moves to the location of the target element, then releases the mouse.
        act.clickAndHold(img4);
        act.moveToElement(img4).release().perform();
        Thread.sleep(5000);
        
    }


}
