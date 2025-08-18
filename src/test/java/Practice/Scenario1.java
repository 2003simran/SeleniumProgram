package Practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Scenario1 {	
	public static void main(String[] args) throws Throwable
	{		
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.amazon.in");		
		driver.manage().window().maximize();	
		driver.findElement(By.cssSelector("[id=\"twotabsearchtextbox\"]")).sendKeys("BlueToothEarBuds");	
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();		Thread.sleep(1000);	
		List<WebElement> allnames = driver.findElements(By.cssSelector("[class='a-size-medium a-color-base a-text-normal']"));		
		for (WebElement name : allnames)	
		{		
			System.out.println("bluetoothname------>"+name.getText());	
			}			
		}}
