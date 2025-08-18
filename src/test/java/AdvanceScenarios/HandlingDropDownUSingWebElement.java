package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUSingWebElement {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.xpath("//option[text()='7']")).click();
		
		driver.findElement(By.xpath("//option[text()='May']")).click();
		
		driver.findElement(By.cssSelector("[value=\"2016\"]")).click();
	}

}
