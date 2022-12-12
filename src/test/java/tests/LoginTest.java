package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	
	@Test
    public void verifyLogin() throws Exception {
        
                
        String email ="admin@yourstore.com";
        String password ="admin";
        
        

        Thread.sleep(3000);
        //before login application title should be
        log.info("before login application title should be" + driver.getTitle());
        lp.verificationOfApplicationTitle("Your store. Login");
        
        log.info("enter userName");
        lp.enterEmail(email);
        log.info("enter password");
        lp.enterPass(password);
        log.info("click on radio checkbox");
        lp.clickCheckboxRem();
        log.info("click on login button");
        lp.clickLoginButton();
        
        
        Thread.sleep(3000);
        log.info("after login application title should be" + driver.getTitle());
        lp.verificationOfApplicationTitle("Dashboard / nopCommerce administration");
        Thread.sleep(3000);
        log.info("Navigate to customer Page");
		log.info("Click on Customers Menu");
		cp.clickonCustomersMenu();
		log.info("Click on Customer link");
		cp.ClickonCustomers();
		Thread.sleep(3000);
		log.info("Enter details in search page");
		cp.enterEmail("anusha.v@gmail.com");
		Thread.sleep(1000);
		cp.enterFirstName("anusha");
		Thread.sleep(1000);
		cp.enterLastName("vadlamudi");
		Thread.sleep(1000);
		cp.clickSearchButton();
		Thread.sleep(3000);
		
//        cp.clickonCustomersMenu();
//        cp.ClickonCustomers();
    }
	
	//@Test
	
	public void customerPage() throws InterruptedException
	{	
		log.info("Navigate to customer Page");
		log.info("Click on Customers Menu");
		cp.clickonCustomersMenu();
		log.info("Click on Customer link");
		cp.ClickonCustomers();
		Thread.sleep(3000);
		log.info("Enter details in search page");
		cp.enterEmail("anusha.v@gmail.com");
		Thread.sleep(1000);
		cp.enterFirstName("anusha");
		Thread.sleep(1000);
		cp.enterLastName("vadlamudi");
		Thread.sleep(1000);
		cp.clickSearchButton();
		Thread.sleep(3000);
		
		
	}

        
    

}
