package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopupEx2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	
		String mainId = driver.getWindowHandle();// Prints single window id where driver is currently in focus
		System.out.println(mainId);

		Set<String> allIds = driver.getWindowHandles();// Prints all window ids
		System.out.println(allIds);

		for (String id : allIds) {
			if (!mainId.equals(id)) {
				driver.switchTo().window(id);
			}
		}
	//	text()=.
	driver.findElement(By.xpath("//a[.='Learn more & submit!']")).click();

	}

}
