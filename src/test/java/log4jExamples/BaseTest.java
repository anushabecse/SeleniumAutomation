package log4jExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
	
	WebDriver driver;
    //ReadConfig conf;
    Logger log;
    //ctrl+Shoift+O ----- autoimport
    //pre-condition    ----- @BeforeSuite-----
    //Test
    //post-condition   ----- @AfterSuite
    
    
    @BeforeTest
    public void launchApp() throws Exception {
        driver =new ChromeDriver();
 
        log = Logger.getLogger("Nop Com Application module");
        PropertyConfigurator.configure(".\\TestData\\log4j.properties");
        
        
        log.info("launching application");
        
        String url ="https://admin-demo.nopcommerce.com/login";
     
        driver.get(url);
        log.info("Application launched successfully into chrome browser "+ url);
        //driver.get(conf.get_sampleApp_URL());
        driver.manage().window().maximize();
        
    }
    
    @AfterTest
    public void closeApp() throws Exception {
        
        Thread.sleep(5000);
        driver.close();
        log.info("closing application");
        //System.out.println("closing application");
    }

}


