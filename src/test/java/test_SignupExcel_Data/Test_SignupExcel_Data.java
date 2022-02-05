package test_SignupExcel_Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test_SignupExcel_Data {
	
	public static	Workbook book;
	public static 	Sheet sheet;                //variable 
		public static Object[][] readdata(String Sheetname) {  // Global Object array declared because Data from Excel sheet might be of different data type
			
			             //variable
			FileInputStream file=null; //Refers to null that is not referring to any object
			try {
				// Reference variable file is assigned value which FileInputStream will read from input data in file
				file = new FileInputStream("C:\\Users\\varin\\eclipse-workspace\\Demoblaze_Project\\src\\test\\java\\test_SignupExcel_Data\\Test_SignupExcel_Data.xls");
				
			}
			
			catch(FileNotFoundException e) {
				e.printStackTrace();
				
			}
			
			try {
		
			book =WorkbookFactory.create(file);//WorkbookFactory is a Factory for creating appropriate kind of workbook by Auto detecting from supplied input in FileInputStream 
		}
			catch(IOException a) {
				a.printStackTrace();
		}
			 sheet= book.getSheet(Sheetname); // From workbook get the Sheet and sheetname is stored in out Object Parameter store it in sheet variable

	 Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];//Get Total number of rows and get total number of column till last cell
			 
			 for(int i=0; i<sheet.getLastRowNum();i++) { //get the total number of rows in worksheet
			 for(int k=0; k<sheet.getRow(0).getLastCellNum();k++) { // get the total number of columns in worksheet
			 data[i][k]=sheet.getRow(i+1).getCell(k).toString(); //Keep on adding 1 in variable i and get cell value and convert into string
			 
			 }
			 }
			return data;
		
		}
		
		

	}


