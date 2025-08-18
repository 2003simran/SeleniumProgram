package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelectClass {

	public static void main(String[] args) {
//SelectByIndex
//SelectByValue
//SelectByVisibleText

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement dateList = driver.findElement(By.id("day"));

		Select select = new Select(dateList);
		// select.selectByIndex(9);
		//select.selectByValue("30");
		select.selectByVisibleText("5");

		WebElement monthList = driver.findElement(By.id("month"));
		Select select1 = new Select(monthList);
		// select1.selectByIndex(6);
		//select1.selectByValue("8");
		select1.selectByVisibleText("Jun");

		WebElement yearList = driver.findElement(By.id("year"));
		Select select2 = new Select(yearList);
		// select2.selectByIndex(6);
		//select2.selectByValue("1998");
		select2.selectByVisibleText("1996");

	}

}
