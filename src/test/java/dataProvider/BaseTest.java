package dataProvider;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CustomerPage;
import pages.LoginPage;


public class BaseTest {
	
	WebDriver driver;
    //ReadConfig conf;
    Logger log;
    LoginPage lp;
    CustomerPage cp;
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
        //System.out.println("launching application");
        
        
        //create an Object on ReadConfig file
     //   conf = new ReadConfig();
        //System.out.println(conf.get_NOP_URL());
        String url ="https://admin-demo.nopcommerce.com/login";
       // log.info("Application URL: "+url );
        
       // driver = WebDriverManager.chromedriver().create();
        driver.get(url);
        log.info("Application launched successfully into chrome browser "+ url);
        //driver.get(conf.get_sampleApp_URL());
        driver.manage().window().maximize();
        
        lp =new LoginPage(driver);
        cp = new CustomerPage(driver);
        
    }
    
    @AfterTest
    public void closeApp() throws Exception {
        
        Thread.sleep(5000);
        driver.close();
        log.info("closing application");
        //System.out.println("closing application");
    }

}


