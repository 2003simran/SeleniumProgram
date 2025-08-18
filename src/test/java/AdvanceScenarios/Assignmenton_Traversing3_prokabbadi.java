package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmenton_Traversing3_prokabbadi {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.prokabaddi.com/standings");
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
	String play = driver.findElement(By.xpath("(//p[@class='name'])[2]/../../../following-sibling::div[1]")).getText();
	System.out.println("Total no of play--->"+play);
	String won = driver.findElement(By.xpath("(//p[@class='name'])[2]/../../../following-sibling::div[2]")).getText();
	System.out.println("Total no of wons--->"+won);
	String lost = driver.findElement(By.xpath("(//p[@class='name'])[2]/../../../following-sibling::div[3]")).getText();
	System.out.println("Total no f lost--->"+lost);
	String draw = driver.findElement(By.xpath("(//p[@class='name'])[2]/../../../following-sibling::div[4]")).getText();
	System.out.println("Total no of draw--->"+draw);

	String scorediff = driver.findElement(By.xpath("(//p[@class='name'])[2]/../../../following-sibling::div[5]")).getText();
	System.out.println("Total no of scorediff--->"+scorediff);
	String form = driver.findElement(By.xpath("(//p[@class='name'])[2]/../../../following-sibling::div[6]")).getText();
	System.out.println("Total no of form--->"+form);
	String points = driver.findElement(By.xpath("(//p[@class='name'])[2]/../../../following-sibling::div[7]")).getText();
	System.out.println("Total no of points--->"+points);
	

	}

}
