package readExeldata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteAndReadExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL");
		Row row = sheet.createRow(7);
		Cell cell = row.createCell(0);
		cell.setCellValue("SRH");
	
		FileOutputStream fos = new FileOutputStream("./data/TestData.xlsx");
		wb.write(fos);
		
		Sheet sheet1 = wb.getSheet("IPL");
		Row row1 = sheet1.getRow(7);
		Cell cell1 = row1.getCell(0);
		String data = cell1.getStringCellValue();
		System.out.println(data);
	}
}
