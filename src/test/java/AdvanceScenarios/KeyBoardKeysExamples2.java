package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardKeysExamples2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]")).sendKeys("Apple");
		Thread.sleep(2000);
		List<WebElement> autoSugg = driver.findElements(By.xpath("//ul[@class='overscroll-contain']/li//span[contains(@class,'StyledLabel2')]"));

		for(WebElement sugg: autoSugg)
		{
			System.out.println(sugg.getText());
			if(sugg.getText().contains("Apple - Ambri"))
				sugg.click();
		}
		
		Thread.sleep(2000);
	}

}
