package DataDrivenTesting_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToCreateRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream fis = new FileInputStream("./testData/Excelsheet1.xlsx/");
			Workbook workbook	= WorkbookFactory.create(fis);

			
			workbook.getSheet("Sheet1").createRow(2).createCell(1).setCellValue("Asit");
			
			FileOutputStream fos = new FileOutputStream("./testData/Excelsheet1.xlsx/");
			workbook.write(fos);

	}

	}


