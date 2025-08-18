package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardUsingKeysClass1 {

	public static void main(String[] args) {

		// Approach1:- KeysClass---->static
		// Approach2:- RobotClass--->non static

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		// case1
//		driver.findElement(http://By.name("user-name")).sendKeys("standard_user");
//		WebElement PASSWORD = driver.findElement(http://By.id("password"));
//		PASSWORD.sendKeys("secret_sauce");
//		PASSWORD.sendKeys(Keys.ENTER);
		// or
//		driver.findElement(http://By.id("password")).sendKeys("secret_sauce",Keys.ENTER);

		// case2:-
//		WebElement USERNAME = driver.findElement(http://By.name("user-name"));
//		USERNAME.sendKeys("standard_user");
//		USERNAME.sendKeys(http://Keys.TAB,"secret_sauce",Keys.ENTER);

		// case3:-
	//	driver.findElement(http://By.name("user-name")).sendKeys("standard_user", http://Keys.TAB, "secret_sauce", Keys.ENTER);

	}

}
