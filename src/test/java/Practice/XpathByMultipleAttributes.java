package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultipleAttributes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		//synatx:- AND   //htmltag[@AttributeNAme='AttributeValue' and @AttributeName='AttributeValue')]
	//	driver.findElement(By.xpath("//input[@type='text' and @name='q']")).sendKeys("puma");
	//	driver.findElement(By.xpath("//button[contains(@aria-label,'Search') and  @type='submit']")).click();
	
		//synatx:- OR   //htmltag[@AttributeNAme='AttributeValue' or @AttributeName='AttributeValue')]
	//driver.findElement(By.xpath("//a[@aria-label=\"Grocery\" or @class=\"_1c\"]")).click();
    //driver.findElement(By.xpath("//input[contains(@title,'e') or @name='q']")).sendKeys("Nike");
	
	driver.get("https://www.amazon.in");
//	driver.findElement(By.xpath("//a[@class=\"nav-a  \" and text()=' Electronics ']")).click();
	driver.findElement(By.xpath("//a[text()='MX Player' or @data-csa-c-slot-id=\"nav_cs_0\"]")).click();
	}
}