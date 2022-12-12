package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis =new FileInputStream("./TestData/RegisterationDetails.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		
		//XSSFSheet sheet =workbook.getSheetAt(0);	//get sheet by index
		XSSFSheet sheet = workbook.getSheet("SmokeTest");
		int rowcount = sheet.getLastRowNum();
		int colcount =sheet.getRow(0).getLastCellNum();
		
		System.out.println("Row count is "+rowcount);
		System.out.println("Column count is "+colcount);
		
		for (int i = 1; i < rowcount; i++) {
			String fname =sheet.getRow(i).getCell(0).toString();
			String locality =sheet.getRow(i).getCell(3).toString();
			
			System.out.println("first name is "+fname);
			System.out.println("locality is "+locality);
			System.out.println("*****************" +i);
		}
		
		

	}

}
