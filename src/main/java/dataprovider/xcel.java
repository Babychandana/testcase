package dataprovider;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class xcel {
@Test
	public String cust(String shName,int rowNum,int colNum) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis=new FileInputStream("./data/xcelData.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sh=wb.getSheet(shName);
	DataFormatter df=new DataFormatter();
	String data =df.formatCellValue(sh.getRow(rowNum).getCell(colNum));
	FileOutputStream fos=new FileOutputStream("./data/xcelData.xlsx");
	wb.write(fos);
	wb.close();
	return data;
	}
}
