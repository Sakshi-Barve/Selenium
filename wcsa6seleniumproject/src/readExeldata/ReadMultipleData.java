package readExeldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	//Read multiple data/values from sheet
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		for(int i=1; i<=6; i++)
		{
			FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
			//make file ready to read
			Workbook wb = WorkbookFactory.create(fis);
			//Provide sheet name
			Sheet sheet = wb.getSheet("IPL");
			//get into a desired row
			Row row = sheet.getRow(i);
			//get into the cell/column
			Cell cell = row.getCell(1);
			//It will read the value
			String data = cell.getStringCellValue();
			Thread.sleep(2000);
			System.out.println(data);
		}
	}
}
