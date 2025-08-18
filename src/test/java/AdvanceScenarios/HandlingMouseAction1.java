package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseAction1 {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

//		driver.manage().window().maximize();
//	    driver.get("https://www.amazon.in");

		// method1:-moveToElement()
//		WebElement ele = driver.findElement(By.xpath("//div[text()='EN']"));
//	    Actions act = new Actions(driver);
//		act.moveToElement(ele).perform();

		//method2:-contextClick()
//	    WebElement link = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
//	    Actions act = new Actions(driver);
//		act.contextClick(link).perform();

		//method:3,4,5,6:- sendKeys(),click(),build(),perform()
//		driver.get("https://www.saucedemo.com/v1/");
//
//		WebElement USERNAME = driver.findElement(http://By.name("user-name"));
//		WebElement PASSWORD = driver.findElement(http://By.name("password"));
//		WebElement LOGIN = driver.findElement(By.className("btn_action"));
//
//		 Actions act = new Actions(driver);
		// case1
//		 act.sendKeys(USERNAME, "standard_user").perform();
//		 act.sendKeys(PASSWORD, "secret_sauce").perform();
//		 http://act.click(LOGIN).perform();

		// or
		// case2:-

		// act.sendKeys(USERNAME, "standard_user").sendKeys(PASSWORD,
		// "secret_sauce").click(LOGIN).perform();

// act.sendKeys(USERNAME, "standard_user").sendKeys(PASSWORD, "secret_sauce").click(LOGIN).build().perform();

		//method7:-clickAndHold()
//		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
//
//		WebElement drag = driver.findElement(http://By.id("draggable"));
//		WebElement drop = driver.findElement(http://By.id("droppable"));

//		Actions act = new Actions(driver);
//        act.clickAndHold(drag).perform();
//        act.release(drop).perform();

		// or
//        act.clickAndHold(drag).release(drop).build().perform();

		// or
//		act.dragAndDrop(drag, drop).perform();
		
//		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		
//		WebElement ele = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
//		
//		Actions act = new Actions(driver);
//		act.doubleClick(ele).perform();
		
		driver.get("https://www.makemytrip.com");
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveByOffset(20, 30).click().perform();
		
	}
	

}


