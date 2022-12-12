package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadDataURLConfig;

public class LoginTest {

	public WebDriver driver;
	public ReadDataURLConfig rdf;

	@BeforeTest

	public void launchurl() {

		driver = WebDriverManager.chromedriver().create();
		// driver =new ChromeDriver();
//		System.out.println("Launching URL" + rdf.getTestingURL());
//		System.out.println("URL is " + rdf.getTestingURL());
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");

	}

	// public void launchURL() throws InterruptedException
	// {
	//
	// System.out.println("Launching URL");
	// driver.get(rdf.getNOPURL());
	//
	// Thread.sleep(4000);
	//
	//
	// }
	@AfterTest

	public void closeApp() {
		System.out.println("Closing Application");
		driver.close();

	}

}
