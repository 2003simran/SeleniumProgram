package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	
		public static void main(String[] args) 
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.prokabaddi.com/standings");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
			driver.findElement(By.xpath("//div[@class='close-btn']")).click();
			for (int i =2 ; i <=13 ; i++) {
			for (int j = 3 ; j <= 14 ; j++ ) {
				String text = driver.findElement(By.xpath("((//div[@class='table-row'])["+i+"]//p)[" +j + "]")).getText();
				System.out.print(text + '\t');
			}
			System.out.println();
			}
		}

}
