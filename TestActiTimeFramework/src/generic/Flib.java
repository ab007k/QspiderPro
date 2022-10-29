package generic;

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
	public String readExcelData(String ExcelPath,String SheetName, int RowCount, int CellCount) throws EncryptedDocumentException, IOException {

		FileInputStream fis=new FileInputStream(ExcelPath);

		Workbook wb=WorkbookFactory.create(fis);

		Sheet sh=wb.getSheet(SheetName);

		Row row=sh.getRow(RowCount);

		Cell cell=row.getCell(CellCount);

		String data=cell.getStringCellValue();

		return data;	

	}

	public int getRowCount(String ExcelPath, String SheetName) throws EncryptedDocumentException, IOException {

		FileInputStream fis=new FileInputStream(ExcelPath);

		Workbook wb=WorkbookFactory.create(fis);

		Sheet sh=wb.getSheet(SheetName);

		int row=sh.getLastRowNum();

		return row;	
	}

	public void writeExcelData(String ExcelPath, String SheetName, int RowCount, int CellCount, String data) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream(ExcelPath);

		Workbook wb=WorkbookFactory.create(fis);

		Sheet sh=wb.getSheet(SheetName);

		Row row=sh.getRow(RowCount);

		Cell cell=row.createCell(CellCount);
		cell.setCellValue(data);

		FileOutputStream fos=new FileOutputStream(ExcelPath);
		wb.write(fos);
	}
	
	public String readProperyFile(String propPath, String key) throws IOException {
		FileInputStream fis=new FileInputStream(propPath);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String value=prop.getProperty(key);
		return value;		
	}
}
