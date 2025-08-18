package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in");

		// method1:-moveToElement()
//		WebElement ele = driver.findElement(By.xpath("//div[text()='EN']"));
//	    Actions act = new Actions(driver);
//		act.moveToElement(ele).perform();

//	    WebElement link = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
//	    Actions act = new Actions(driver);
//		act.contextClick(link).perform();

//		driver.get("https://www.saucedemo.com/v1/");
//
//		WebElement USERNAME = driver.findElement(http://By.name("user-name"));
//		WebElement PASSWORD = driver.findElement(http://By.name("password"));
//		WebElement LOGIN = driver.findElement(By.className("btn_action"));
//
//		 Actions act = new Actions(driver);
		 //case1
//		 act.sendKeys(USERNAME, "standard_user").perform();
//		 act.sendKeys(PASSWORD, "secret_sauce").perform();
//		 http://act.click(LOGIN).perform();
		 
		//or
		 //case2:-
		 
 //act.sendKeys(USERNAME, "standard_user").sendKeys(PASSWORD, "secret_sauce").click(LOGIN).perform();
		
// act.sendKeys(USERNAME, "standard_user").sendKeys(PASSWORD, "secret_sauce").click(LOGIN).build().perform();
	
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	
		WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        
        Actions act = new Actions(driver);
//        act.clickAndHold(drag).perform();
//        act.release(drop).perform();
        
        //or
//        act.clickAndHold(drag).release(drop).build().perform();
        
        //or
        act.dragAndDrop(drag, drop).perform();

	}

}
