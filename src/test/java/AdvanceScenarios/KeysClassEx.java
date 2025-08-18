package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysClassEx {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();

		WebElement UN = driver.findElement(By.name("user-name"));
		UN.sendKeys("Shobha", Keys.CONTROL + "a");
		UN.sendKeys(Keys.CONTROL + "c");
		UN.sendKeys(Keys.TAB, Keys.CONTROL + "v");

	}

}
