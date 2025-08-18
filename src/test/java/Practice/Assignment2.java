package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws Throwable {

WebDriver driver=new ChromeDriver();
driver.get("https://www.youtube.com");
driver.manage().window().maximize();
driver.findElement(By.cssSelector("[name='search_query']")).sendKeys("PacMan");
Thread.sleep(3000);
driver.findElement(By.cssSelector("#search-icon-legacy")).click();
Thread.sleep(3000);

driver.findElement(By.linkText("Pacman's Best Adventures Compilation | Pacman vs Two-Leggged & Rolling Robots, Coal Pacman")).click();
String title = driver.getTitle();
System.out.println(title);	
	
	
	}


}
