package testNgProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class UtilityMethods {
	public String readingDataFromPropertyFile(String path, String key) throws IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);

		Properties prop = new Properties();
		prop.load(fis);

		String value = prop.getProperty(key);
		return value;
	}

	public String readingSingleDataFromExcelFile(String path, String sheetName, int rowNum, int colNum)
			throws EncryptedDocumentException, IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);

		String data = sheet.getRow(rowNum).getCell(colNum).toString();
		return data;
	}

	public String[] readingRowOfDataFromExcelFile(String path, String sheetName, int colNum)
			throws EncryptedDocumentException, IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);

		int rowNum = sheet.getPhysicalNumberOfRows();
		String[] data = new String[rowNum];

		for (int i = 0; i < rowNum; i++) {
			String dataFromCell = sheet.getRow(i).getCell(colNum).toString();
			data[i] = dataFromCell;
		}
		return data;
	}

	public static String[][] readingDataFromMultipleRowColumn(String path, String sheetName)
			throws EncryptedDocumentException, IOException {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);

		int rowNum = sheet.getPhysicalNumberOfRows();
		int colNum = sheet.getRow(0).getPhysicalNumberOfCells();

		String[][] data = new String[rowNum][colNum];

		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < colNum; j++) {
				String dataFromCell = sheet.getRow(i).getCell(j).toString();
				data[i][j] = dataFromCell;
			}
		}
		return data;
	}

}
