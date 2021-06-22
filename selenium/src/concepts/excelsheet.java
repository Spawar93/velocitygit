package concepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class excelsheet {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
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
			}
		    System.out.println();
		 }
		
	}	
		
		
		catch(IllegalStateException e)
		{
			System.out.println("Any Exception");
		} 
		
		finally
		{
			System.out.println("Finally block");
		}    
		
	
	}

}
