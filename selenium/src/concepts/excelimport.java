package concepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class excelimport {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\SANDY\\Desktop\\importfile.xlsx");
		
			//String s = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	       // System.out.println(s);
			
			Sheet a= WorkbookFactory.create(file).getSheet("Sheet1");
	
			
			for(int i=1; i<=1   ; i++)
			{
				for(int j=0; j<=2; j++)
				{  try {
					 String value =a.getRow(i).getCell(j).getStringCellValue();
					 System.out.print(value+" ");
				     }
				    catch(IllegalStateException illegal)
				    {
				    	 double num =a.getRow(i).getCell(j).getNumericCellValue();
				    	 
						 System.out.print(num+" ");
				    }
					
				}
				System.out.println();
			}      

	}
	

}
