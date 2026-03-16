package Utilities;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritedatintoExcelfile 
{
	public static void main(String[] args) throws IOException{
		
		
		FileOutputStream file=new FileOutputStream("src/main/java/testData/TestData1.xlsx");

		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("customerid");
		XSSFRow row=sheet.createRow(0);
		row.createCell(0).setCellValue("6071");

		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("file is created");

			
				}
			

}
