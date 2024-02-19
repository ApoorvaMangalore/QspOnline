package toReadFromFromExternalFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropFile {

	public static void main(String[] args) throws IOException {
		// Step1:create obj for File
		File file = new File("./testData/data.properties");

		// step2:create obj for fis
		FileInputStream fis = new FileInputStream(file);

		// step3:Create obj for which file your working
		Properties prop = new Properties();
		prop.load(fis);

		System.out.println(prop.get("url"));
		System.out.println(prop.get("username"));

	}

}
