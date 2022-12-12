package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//FileInputStream fis =new FileInputStream("C:\\Users\\Student\\eclipse-workspace\\HelloWorld\\TestData\\Config.properties");
		
		FileInputStream fis =new FileInputStream("./TestData/Config.properties");
		Properties prop =new Properties();
		prop.load(fis);
		
		System.out.println("QA Path "+prop.getProperty("appURL_QA"));
		System.out.println("Prod PAth "+prop.getProperty("appURL_Prod"));
		
	}

}
