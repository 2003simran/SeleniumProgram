package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathEx2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in");

		// xpath by attribute ----->syntax1:- //htmltag[@AttributeName='AttributeValue']
		// driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_newreleases']")).click();

		// xpath by visible text ---->syntax2:- //htmltag[text()='AttributeValue']
		// driver.findElement(By.xpath("//a[text()='Mobiles']")).click();

		// driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]")).click();

		// xpath contains attribute ---->syntax3:- //htmltag[contains(@AttributeName,'AttributeValue')]
		
		// //htmltag[contains(@AttributeName,'AttributeValue')]
		// driver.findElement(By.xpath("//a[contains(@data-csa-c-content-id,'s_n')]")).click();
		//driver.findElement(By.xpath("//input[contains(@placeholder,'n')]")).sendKeys("BlueTooth");
		
		//xpath contains visible text syntax4:- //htmltag[contains(text(),'AttributeValue')]
		driver.findElement(By.xpath("//a[contains(text(),'Home &')]")).click();
	}

}
