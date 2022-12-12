package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerPage {
	WebDriver driver;
	public CustomerPage(WebDriver rdriver) {
		driver =rdriver;
		
	}
	
	By custMenu =By.xpath("//a[@href=\"#\"]//child::p[contains(text(),\"Customers\")]");
	By	cust =By.xpath("//a[@href='/Admin/Customer/List']//child::p[contains(text(),'Customers')]");
	By entremail =By.xpath("//input[@name=\"SearchEmail\"]");
	By enterfname =By.xpath("//input[@name=\"SearchFirstName\"]");
	By enterlname =By.xpath("//input[@name=\"SearchLastName\"]");
	By serchbtn =By.id("search-customers");
	
	
	public void clickonCustomersMenu()
	{
		driver.findElement(custMenu).click();;
	}
	
	public void ClickonCustomers()
	{
		driver.findElement(cust).click();
	}
	
	public void enterEmail(String email)
	{
		driver.findElement(entremail).sendKeys(email);
	}

	public void enterFirstName(String fname)
	{
		driver.findElement(enterfname).sendKeys(fname);
	}
	
	public void enterLastName(String lname)
	{
		driver.findElement(By.xpath("//input[@name=\"SearchLastName\"]")).sendKeys(lname);
	}
	
	public void clickSearchButton()
	{
		driver.findElement(serchbtn).click();
	}
}
