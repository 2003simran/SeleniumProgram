package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonEx {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		// driver.findElement(http://By.name("field-keywords")).sendKeys("Nike");

		// driver.findElement(By.linkText("Mobiles")).click();

		// driver.findElement(By.linkText("Sell")).click();

		// driver.findElement(By.partialLinkText("Today's")).click();

		// Locator:--->tagName()
		List<WebElement> allImgs = driver.findElements(By.tagName("img"));
		System.out.println(allImgs.size());

	}

}
