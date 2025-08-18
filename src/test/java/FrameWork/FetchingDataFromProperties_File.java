package FrameWork;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromProperties_File {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/v1");
//		driver.manage().window().maximize();
//
//		driver.findElement(http://By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(http://By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(http://By.id("login-button")).click();
		//----------------------------------------------------------------------
		
		//step1:- path connection
	//	FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Downloads\\http://CommonDatass.properties");

		FileInputStream fis = new FileInputStream("./src/test/resources/CommonDatass.properties");
		
		//step2:-load all the keys into properties class
		Properties pro = new Properties();
		pro.load(fis);
		
		//step3:- read all the keys using getProperty()
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();

	}

}
