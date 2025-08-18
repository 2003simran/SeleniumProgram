package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartEx {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

//		driver.findElement(http://By.name("q")).sendKeys("iphone");
//        driver.findElement(By.className("_2iLD__")).click();

		driver.findElement(By.linkText("Top Offers")).click();
	}

}
