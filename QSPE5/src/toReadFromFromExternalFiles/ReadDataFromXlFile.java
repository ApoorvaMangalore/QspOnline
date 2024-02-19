package toReadFromFromExternalFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromXlFile {

	public static void main(String[] args) throws IOException {
		//step1:Create obj for File
		File file=new File("./testData/testdata.xlsx");
		
		//step1:Create obj for File input stream
		FileInputStream fis=new FileInputStream(file);
		
		//Step3:Create obj for XSSFWorkbook
		XSSFWorkbook xsf =new XSSFWorkbook(fis);
		
		//Step3: To get sheet name
		String sheetname = xsf.getSheetName(0);
		System.out.println(sheetname);
		
		//step4:refer for sheet
		XSSFSheet sheet = xsf.getSheet(sheetname);
		
		//Step4:Now you can call getRow() and getCell() to retrive value
		String entry1 = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(entry1);
		
		String entry2 = sheet.getRow(0).getCell(2).getStringCellValue();
		System.out.println(entry2);
		
		String entry3 = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(entry3);

	}

}
