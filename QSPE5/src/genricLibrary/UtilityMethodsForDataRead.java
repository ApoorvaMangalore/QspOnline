package genricLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/***
 * 
 * @author Apoorva
 */
public class UtilityMethodsForDataRead {
	/**
	 * 
	 * @param path you have to pass path of the ptoperty file
	 * @param key  you have to pass key from propertuFile
	 * @return String
	 * @throws IOException
	 */

	public String readingTheDataFromProptyFile(String path, String key) throws IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}

	/**
	 * 
	 * @param path
	 * @param sheetName
	 * @param rowNum
	 * @param colNum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public String readingDataExcelSinglevalue(String path, String sheetName, int rowNum, int colNum)
			throws EncryptedDocumentException, IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Workbook woorkBook = WorkbookFactory.create(fis);
		Sheet sheet = woorkBook.getSheet(sheetName);
		String data = sheet.getRow(rowNum).getCell(colNum).toString();
		return data;

	}

	/**
	 * 
	 * @param path
	 * @param sheetName
	 * @param colNum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public String[] readingRowDataFromExcel(String path, String sheetName, int colNum)
			throws EncryptedDocumentException, IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Workbook woorkBook = WorkbookFactory.create(fis);
		Sheet sheet = woorkBook.getSheet(sheetName);
		int rowNum = sheet.getPhysicalNumberOfRows();
		String[] data = new String[rowNum];
		for (int i = 0; i < rowNum; i++) {
			String dataFromCell = sheet.getRow(i).getCell(colNum).toString();
			data[i] = dataFromCell;
		}
		return data;
	}

	/**
	 * 
	 * @param path
	 * @param sheetName
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public static String[][] readingDataFromMultipleRowColumn(String path, String sheetName)
			throws EncryptedDocumentException, IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Workbook woorkBook = WorkbookFactory.create(fis);
		Sheet sheet = woorkBook.getSheet(sheetName);
		int rowNum = sheet.getPhysicalNumberOfRows();
		int colNum = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data = new String[rowNum][colNum];
		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < colNum; j++) {
				String dataFromExcel = sheet.getRow(i).getCell(j).toString();
				data[i][j] = dataFromExcel;
			}
		}
		return data;
	}
}
