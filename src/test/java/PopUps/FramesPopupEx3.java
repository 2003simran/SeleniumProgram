package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPopupEx3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.findElement(By.linkText("Nested Frames")).click();

		driver.switchTo().frame("frame-top");

		// driver.switchTo().frame(2);
		driver.switchTo().frame("frame-left");
		String leftFrame = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		System.out.println(leftFrame);

		// driver.switchTo().frame("frame-top");
//		WebElement topFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));
//		driver.switchTo().frame(topFrame);

		driver.switchTo().parentFrame();

		driver.switchTo().frame("frame-middle");
		String middleFrame = driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
		System.out.println(middleFrame);

//		driver.switchTo().parentFrame();
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame-bottom");
		String BottomFrame = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		System.out.println(BottomFrame);
	}

}
