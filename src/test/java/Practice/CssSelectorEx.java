package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorEx {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1");
		driver.manage().window().maximize();

		//syntax1:-- [AttributeName='AttributeValue']
//		driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
//        driver.findElement(By.cssSelector("[type='password']")).sendKeys("secret_sauce");
//	    driver.findElement(By.cssSelector("[value=\"LOGIN\"]")).click();

		//syntax2:--  htmltag[AttributeName='AttributeValue']
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

}
