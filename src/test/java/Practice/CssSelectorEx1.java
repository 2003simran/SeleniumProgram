package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorEx1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1");
		driver.manage().window().maximize();

		// syntax1:-- [AttributeName='AttributeValue']
//		driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
//        driver.findElement(By.cssSelector("[type='password']")).sendKeys("secret_sauce");
//	    driver.findElement(By.cssSelector("[value=\"LOGIN\"]")).click();

		// syntax2:-- htmltag[AttributeName='AttributeValue']
//		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("secret_sauce");
//		driver.findElement(By.cssSelector("input[type='submit']")).click();

		// synatx3:- #AttributeValue ,supports only id Attribute/Locator
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");

		// syntax4:- htmltag#AttributeValue ,supports only id Attribute/Locator
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");

		// syntax5:- .AttributeValue ,supports only className Attribute/Locator
		// driver.findElement(By.cssSelector(".btn_action")).click();

		// syntax6:- htmltag.AttributeValue ,supports only className Attribute/Locator
		driver.findElement(By.cssSelector("input.btn_action")).click();
	}



}
