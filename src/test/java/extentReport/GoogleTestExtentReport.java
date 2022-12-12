package extentReport;

import java.text.SimpleDateFormat;
//import java.sql.Date;
//import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GoogleTestExtentReport {
	public ExtentHtmlReporter htmlreport;
	public ExtentReports extent;
	public ExtentTest logger;
	
	@BeforeTest
	public void startReport()
	
	{
		//String datenum =new SimpleDateFormat("yymmddhhmmss").format(new Date());
		String datenum = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		htmlreport = ExtentHtmlReporter(".\\extentReport\\IBM_RegressionAutomation1.html");
		
		 extent =new ExtentReports();
		 
		 extent.attachReporter(htmlreport);
		 
		 extent.setSystemInfo("Environment", "Production");
		 extent.setSystemInfo("HostName","LocalHost");
		 extent.setSystemInfo("Os","Windows");
		 extent.setSystemInfo("UserName", "Anusha");
		 
		 htmlreport.config().setDocumentTitle("IBM Functional/Automation Report");
		 htmlreport.config().setReportName("Regression Report");
		 htmlreport.config().setTheme(Theme.DARK);
		 
	}
	
	private ExtentHtmlReporter ExtentHtmlReporter(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@AfterTest
	public void endReport()
	{
		extent.flush();
	}
	
	@Test
	public void verifyAppTitle()
	{
		logger =extent.createTest("Test case - verifyAppTitle");
		
	}
	@Test
	public void verifylogo()
	{
		logger = extent.createTest("Test Case -Verifylogo");
		logger.log(Status.FAIL, MarkupHelper.createLabel("Test Case--Verify App Log", ExtentColor.RED));
	}

}
