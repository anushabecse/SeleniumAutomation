package utility;
// Generated by Selenium IDE
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class LoginTestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void loginTest() throws IOException {
	  
	  ReadDataURLConfig rd =new ReadDataURLConfig();
	 String url = rd.getappURL();
	 System.out.println(url);
	  
  //  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.get(url);
    driver.manage().window().setSize(new Dimension(1026, 569));
    driver.findElement(By.name("username")).sendKeys("Admin");
    driver.findElement(By.name("password")).sendKeys(Keys.DOWN);
    driver.findElement(By.name("password")).sendKeys(Keys.TAB);
    driver.findElement(By.cssSelector(".oxd-button")).click();
    driver.findElement(By.cssSelector(".oxd-userdropdown-name")).click();
    driver.findElement(By.linkText("About")).click();
    driver.findElement(By.cssSelector(".oxd-dialog-close-button")).click();
    driver.findElement(By.cssSelector(".orangehrm-dashboard-widget:nth-child(4)")).click();
  }
}
