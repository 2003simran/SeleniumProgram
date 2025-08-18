package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class InsertDataIntoPropertiesFile {

	public static void main(String[] args) throws Throwable {
		

		FileInputStream fis = new FileInputStream("./src/test/resources/CommonDatass.properties");
		
		//step2:-load all the keys into properties class
		Properties pro = new Properties();
		
		pro.setProperty("url", "https://www.saucedemo.com/v1");
		pro.setProperty("username", "standard_user");
		pro.setProperty("password", "secret_sauce");
		
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/CommonDatass.properties");
		pro.store(fos, "PropertiesFileData");

	}

}
