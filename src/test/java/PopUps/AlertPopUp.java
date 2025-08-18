package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//		driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
//		Alert alt = driver.switchTo().alert();
//		String txt = alt.getText();  //read alert text
//	    System.out.println(txt);
//	     alt.accept();
		
	//	driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
	    
	//	driver.switchTo().alert().accept();  //accept the alert(click on Ok)
	//	driver.switchTo().alert().dismiss(); //dismiss the alert(click on cancel)
		
		driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Qspiders");   //sending text to alert popup
		alt.accept();

	}

}
