package utility.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceldata {
	
	

	public static void datamethod() throws EncryptedDocumentException, IOException {
	
	
	
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
		    try {
				  String value=c.getStringCellValue();
				  System.out.print(value+" ");
				}
		    catch(Exception illegal)
		    {
		    	double value=c.getNumericCellValue();
				  System.out.print(value+" ");
		    }
		    
			}
			System.out.println();
		}	
			
			
		   
		 }
	
}
