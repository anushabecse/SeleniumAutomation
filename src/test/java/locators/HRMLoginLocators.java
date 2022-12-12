package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMLoginLocators {
	@Test
	public void verifylogin() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(4000);
		
		WebElement txtusername =driver.findElement(By.name("username"));
		txtusername.sendKeys("Admin");
		String usernamePlaceholder = txtusername.getAttribute("placeholder");
		System.out.println("Placeholder name is "+usernamePlaceholder);
		Thread.sleep(4000);
		
//		List<WebElement> all_Ele =driver.findElements(By.className("oxd-input oxd-input--active"));
//		
//		System.out.println("count is" +all_Ele.size());
//		all_Ele.get(1).getAttribute("placeholder");
//		all_Ele.get(1).sendKeys("admin123");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		//login button
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(7000);
		
		//get username after login
		WebElement loggedinusername =driver.findElement(By.className("oxd-userdropdown-name"));
		String strusername =loggedinusername.getText();
		System.out.println("Loggedin username "+strusername);
		loggedinusername.click();
		
		Thread.sleep(4000);
		//logout using linktext
		
		driver.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
		
		
	}

}
