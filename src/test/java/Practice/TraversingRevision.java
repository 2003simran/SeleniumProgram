package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraversingRevision {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
//		String price = driver.findElement(By.xpath("//*[.='Apple iPhone 15 (Black, 128 GB)']/../..//div[@class='Nx9bqj _4b5DiR']")).getText();
//	    System.out.println(price);
		
		String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../following-sibling::div//div[@class='Nx9bqj _4b5DiR']")).getText();
	    System.out.println(price);

	}

}
