package Website_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println("Url of the page"+url);
		String title = driver.getTitle();
		System.out.println("Title of the webpage "+title);
		 Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
		 Thread.sleep(2000);
		WebElement select = driver.findElement(By.cssSelector("select[title=\"Search in\"]"));
		 Select options = new Select(select);
		 System.out.println(options.getFirstSelectedOption().getText());
		 options.selectByVisibleText("Amazon Pharmacy");
		 Thread.sleep(2000);
		 options.selectByValue("search-alias=baby");
		 Thread.sleep(2000);
		 //fetch all options
		List<WebElement> alloptions = options.getOptions();
		for(WebElement option:alloptions)
		{
		System.out.println("options : "+option.getText());
		}

	}

}
