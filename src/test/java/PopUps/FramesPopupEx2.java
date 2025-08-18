package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPopupEx2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frames.html");

		// case1:--->Switching frames using index value
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Gud noon");

		// case2:---->Switching frames using id Attribute
//		driver.switchTo().frame("singleframe");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Qspiders");

		// case3:---->Switching frames using name Attribute
//		driver.switchTo().frame("SingleFrame");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Gud mrng");

		// case4:---->Switching frames using id Attribute
//	WebElement frameEle = driver.findElement(By.xpath("//iframe[@id='singleframe']"));

//		driver.switchTo().frame(frameEle);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
	}

}
 

