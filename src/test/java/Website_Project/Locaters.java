package Website_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),\"Text Box\")]")).click();
		Thread.sleep(3000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
		Thread.sleep(3000);
		//Types of Locators(It is used to find elements in the webpages)
		//1.id
		driver.findElement(By.id("userName")).sendKeys("xyz");
		//2.classname
		//driver.findElement(By.className("mr-sm-2 form-control")).sendKeys("user123@gmail.com");
//		//3.linktext
//		driver.findElement(By.linkText("")).click();
//		//4.partiallinktext
//		driver.findElement(By.partialLinkText("")).click();
//		//5.cssSelecter
	driver.findElement(By.cssSelector("#userEmail")).sendKeys("user123@gmail.com");
//		//6.css
		
		
		
		
		
		
		

	}

}
