package controlhandles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import locators.LoginTest;

public class Handledropdowns extends LoginTest{
//	WebDriver driver =WebDriverMaanger
	
	
	@Test
	public void verifyList() throws Exception {
        
	//	WebDriverManager.chromedriver().setup();
		//public WebDriver driver;
//		WebDriver driver =new ChromeDriver();
        //driver.get("http://only-testing-blog.blogspot.com/");
        WebElement countryList = driver.findElement(By.cssSelector("select[name='FromLB']"));
        
        //Select class
        
        Select sel = new Select(countryList);
        
        System.out.println("is listbox accept multiple selection or not: " + sel.isMultiple());
        
        //Select value from dropdown
        //Index
        //visibleText
        //value
        Thread.sleep(1000);
        sel.selectByIndex(0);               //USA
        Thread.sleep(1000);
        sel.selectByValue("India");         //India
        Thread.sleep(1000);
        sel.selectByVisibleText("Spain");   //Spain
        
        //DeSelect value from dropdown
        Thread.sleep(2000);
        sel.deselectByVisibleText("USA");
        Thread.sleep(2000);
        sel.deselectAll();
        
        
        //Select 
        sel.selectByValue("India"); 
    }
    
//    
//    public void verifyList2() throws Exception {
//        
//        
//        WebElement carList = driver.findElement(By.tagName("select"));
//        
//        //Select class
//        
//        Select sel = new Select(carList);
//        
//        System.out.println("is listbox accept multiple selection or not: " + sel.isMultiple());
//        
//        //Select value from dropdown
//        //Index
//        //visibleText
//        //value
//        Thread.sleep(1000);
//        sel.selectByIndex(1);                   //Saab
//        Thread.sleep(1000);
//        sel.selectByValue("Singapore");         //Opel
//        Thread.sleep(1000);
//        sel.selectByVisibleText("Toyota");      //Toyota
//        
//        
//    }

}
