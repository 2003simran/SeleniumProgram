package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestionEx1 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("Bluetooth");

		Thread.sleep(2000);
List<WebElement> allSugg = driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc _3ofZy1\"]//li"));
		Thread.sleep(2000);
		for (WebElement sugg : allSugg) {
			System.out.println(sugg.getText());
			if (sugg.getText().contains("bluetooth speaker boat")) {
				sugg.click();
			}
		}

	}

}
