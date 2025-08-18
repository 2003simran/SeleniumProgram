package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorEx2 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		// syntax1:-- [AttributeName='AttributeValue']
		// driver.findElement(By.cssSelector("[href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']")).click();

		// syntax2:-- htmltag[AttributeName='AttributeValue']
		// driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_bestsellers']")).click();

		driver.findElement(By.cssSelector("[placeholder='Search http://Amazon.in']")).sendKeys("NikeShoes");
		driver.findElement(By.cssSelector("input[type='submit']")).click();

		//linkText()
		String name = driver.findElement(By.linkText("Mens Revolution 7 Men's Road Running Shoes Running Shoes")).getText();
		System.out.println(name);

	}

}
