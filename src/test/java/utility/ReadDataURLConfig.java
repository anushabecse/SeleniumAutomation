package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataURLConfig {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public Properties prop;
		
		public ReadDataURLConfig() throws IOException
		{
			FileInputStream fis =new FileInputStream("./TestData/Config.properties");
			
			prop =new Properties();
			prop.load(fis);
				
			
		}
		
		public String getappURL()
		{
			return prop.getProperty("appURL_Orange");
		}
		public String getNOPURL()
		{
			return prop.getProperty("nopurl");
		}
		public String getNOPPassowrd()
		{
			return prop.getProperty("nopPassword");
			
		}
		public String getNOPUsername()
		{
			return prop.getProperty("nopUserName");
		}
		
		public String getTestingURL()
		{
			return prop.getProperty("testingurl");
		}
		

	}

//}
