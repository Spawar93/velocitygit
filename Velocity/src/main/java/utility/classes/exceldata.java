package utility.classes;

import java.io.FileInputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceldata  {
	

    public static String IdndPassword() {
	
	
	try {
		String path = "C:\\Users\\SANDY\\Desktop\\importfile.xlsx";
		FileInputStream  file = new FileInputStream(path);
		
		Workbook x = WorkbookFactory.create(file);
		Sheet s = x.getSheet("Sheet1");
		    int row=s.getLastRowNum();
		    Row p = s.getRow(0);
		  int  cell= p.getLastCellNum();
		  
		for(int i=1; i<row; i++)
		{
			
			for(int j=0; j<cell; j++)
			{
				Row r = s.getRow(i);
				 
				Cell c= r.getCell(j);
				String value=c.getStringCellValue();
				System.out.print(value+" ");
				return value;
			}
		    System.out.println();
		 }
		
		}	
		
		catch(EncryptedDocumentException  r)
		{
			System.out.println("Encrypted Document Exception");
		} 
		
		
		catch(Exception e)
		{
			System.out.println("Any Exception");
		} 
    }
  }
