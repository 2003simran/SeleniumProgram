package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextEx {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
	
   //     driver.findElement(By.linkText("MX Player")).click();
	
	driver.findElement(By.partialLinkText("Home & ")).click();

	}

}
