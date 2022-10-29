//Generic Reusable method
package qsp15.DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readExcelData(String ExcelPath,String SheetName, int RowCount, int CellCount) throws EncryptedDocumentException, IOException {

		FileInputStream fis=new FileInputStream(ExcelPath);

		Workbook wb=WorkbookFactory.create(fis);

		Sheet sh=wb.getSheet(SheetName);

		Row row=sh.getRow(RowCount);

		Cell cell=row.getCell(CellCount);

		String data=cell.getStringCellValue();

		return data;	

	}

	public int getRowCount(String ExcelPath, String SheetName) throws EncryptedDocumentException, IOException{

		FileInputStream fis=new FileInputStream(ExcelPath);

		Workbook wb=WorkbookFactory.create(fis);

		Sheet sh=wb.getSheet(SheetName);

		int rc=sh.getLastRowNum();

		return rc;

	}

	public void writeExcelData(String ExcelPath, String SheetName, int RowCount, int cellCount, String data) throws IOException {
		
		FileInputStream fis=new FileInputStream(ExcelPath);

		Workbook wb=WorkbookFactory.create(fis);

		Sheet sh=wb.getSheet(SheetName);

		Row row=sh.getRow(RowCount);

		Cell cell=row.createCell(cellCount);
		cell.setCellValue(data);

		FileOutputStream fos=new FileOutputStream(ExcelPath);
		wb.write(fos);
	}
	
}
