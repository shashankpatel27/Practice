package utils;

import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {

	public static String getDataFromExcelSheet() throws EncryptedDocumentException, IOException {
		
		String value = null;
		String path ="C:\\Users\\27sas\\Desktop\\Test.xlsx";
		FileInputStream file= new FileInputStream(path);
		
	    Workbook book= WorkbookFactory.create(file);
	    
	    Sheet sheet= book.getSheet("Velocity");
	    
		int rowCount= sheet.getLastRowNum();
		
		int colCount=sheet.getRow(0).getLastCellNum();
		
		System.out.println(colCount);
		for(int i=1;i<=rowCount;i++)
		{   
			for(int j=0;j<colCount;j++)
			{	
				Row currentRow =sheet.getRow(i);
				Cell currentCell=currentRow.getCell(j);
				
				try {
					
					value=currentCell.getStringCellValue();
					
				}
				catch(IllegalStateException ill){
					int num=(int) currentCell.getNumericCellValue();
					 value=Double.toString(num);
					
					
				}
			      
			}
				
		}
		return value;
		
		
         
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
       String value=Utility.getDataFromExcelSheet();
       System.out.println(value);
	}

}

