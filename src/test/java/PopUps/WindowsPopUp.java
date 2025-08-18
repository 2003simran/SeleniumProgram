package PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopUp {

	public static void main(String[] args) {

		// Approach1:---> Using Window Ids (Can Handle only Two Windows)
		// Approach2:--->Using Title/CurrentURL (Can Handle Multiple Windows)

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("puma", Keys.ENTER);
		driver.findElement(By.xpath("(//a[@class='WKTcLC'])[1]")).click();

		String mainId = driver.getWindowHandle();// Prints single window id where driver is currently in focus
		System.out.println(mainId);

		Set<String> allIds = driver.getWindowHandles();// Prints all window ids
		System.out.println(allIds);

		for (String id : allIds) {
			if (!mainId.equals(id)) {
				driver.switchTo().window(id);
			}
		}
		String price = driver.findElement(By.xpath("//div[@class='Nx9bqj CxhGGd']")).getText();
		System.out.println(price);
	}
	}

