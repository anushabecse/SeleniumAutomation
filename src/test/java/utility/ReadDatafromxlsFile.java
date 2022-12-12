package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadDatafromxlsFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis =new FileInputStream("./TestData/StudentDetails.xls");
		HSSFWorkbook workbook =new HSSFWorkbook(fis);
		
		//XSSFSheet sheet =workbook.getSheetAt(0);	//get sheet by index
		HSSFSheet sheet = workbook.getSheet("SmokeTest");
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


