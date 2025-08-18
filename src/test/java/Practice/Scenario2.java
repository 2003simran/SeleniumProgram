package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario2 {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("BlueToothEarBuds");
		driver.findElement(By.cssSelector("[type='submit']")).click();

		Thread.sleep(2000);
		List<WebElement> allNames = driver.findElements(By.cssSelector("[class='wjcEIp']"));

		for (WebElement name : allNames)
		{
		System.out.println("Bluetooth name----->"+name.getText());	
		}
	}

}
