package toReadFromFromExternalFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDateFromXl {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// step1:Create obj for File
		File file = new File("./testData/testdata.xlsx");

		// step1:Create obj for File input stream
		FileInputStream fis = new FileInputStream(file);

		// it will take about yout xl extension
		Workbook workbook = WorkbookFactory.create(fis);

		LocalDateTime date = workbook.getSheet("data").getRow(2).getCell(1).getLocalDateTimeCellValue();

		System.out.println(date);
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		System.out.println(date.getDayOfMonth());
	}

}
