package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsPopUpEx3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		Set<String> allWins = driver.getWindowHandles();// win1,win2

		for (String win : allWins) {
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.contains("Selenium")) {
				break;
			}
		}

		driver.findElement(By.linkText("Learn more & submit!")).click();
		// --------------------------------------------------------------------------------------
				Set<String> allWins1 = driver.getWindowHandles();// win1,win2,win3---->switching win3

				for (String win1 : allWins1) {
					driver.switchTo().window(win1);
					String titles = driver.getTitle();
					System.out.println(titles);
					if (titles.contains("SeleniumConf & AppiumConf")) {
						break;
					}
				}

				driver.findElement(By.xpath("//a[text()='Veles e Vents']")).click();
			//	driver.close();//closes single tab/win where driver is currently in focus
			//	driver.quit();//closes all the tabs/wins including browser 
				// ---------------------------------------------------------------------------------------

				Set<String> allWins2 = driver.getWindowHandles();// win1,win2,win3,win4---->switching win1

				for (String win2 : allWins2) {
					driver.switchTo().window(win2);
					String titles1 = driver.getTitle();
					System.out.println(titles1);
					if (titles1.contains("Frames & windows")) {
						break;
					}
				}

				driver.findElement(By.linkText("Home")).click();

	}

}
