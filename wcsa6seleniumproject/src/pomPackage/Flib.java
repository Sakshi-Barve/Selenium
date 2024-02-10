package pomPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//it is use to store generic re
	//Create Generic Reuseable methods
		//We will not use main method in Generic Reuseable method 
		
		//To read data from excel file
		public String readExcelData(String excelPath, String sheetName, int rowCount, int cellCount) throws IOException
		{
			//provide Excel path which we need to work with
			FileInputStream fis = new FileInputStream(excelPath);
			//To make excel file ready to read
			Workbook wb = WorkbookFactory.create(fis);
			//To read sheet from excel 
			Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowCount);
			Cell cell = row.getCell(cellCount);
			String data = cell.getStringCellValue();
			return data;
		}
		
		//Write data in excel file
		public void writeExcelData(String excelPath, String sheetName, int rowCount, int cellCount, String data) throws EncryptedDocumentException, IOException
		{
			//provide Excel path which we need to work with
			FileInputStream fis = new FileInputStream(excelPath);
			//To make excel file ready to read
			Workbook wb = WorkbookFactory.create(fis);
			//To read sheet from excel 
			Sheet sheet = wb.getSheet(sheetName);
			Row row = sheet.getRow(rowCount);
			Cell cell = row.createCell(cellCount);
			cell.setCellValue(data);
			
			FileOutputStream fos = new FileOutputStream(excelPath);
			wb.write(fos);
		}
		
		//To get Last Row Count
		public int getLastRowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
		{
			//provide Excel path which we need to work with
			FileInputStream fis = new FileInputStream(excelPath);
			//To make excel file ready to read
			Workbook wb = WorkbookFactory.create(fis);
			//To read sheet from excel 
			Sheet sheet = wb.getSheet(sheetName);
			int rc = sheet.getLastRowNum();
			return rc;
		}
		
		public String readPropertyData(String propPath, String key) throws IOException
		{
			FileInputStream fis = new FileInputStream(propPath);
			Properties prop = new Properties();
			prop.load(fis);
			String data = prop.getProperty(key);
			return data;
		}

}
