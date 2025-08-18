package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.prokabaddi.com/standings");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List<WebElement> Numbers = driver.findElements(By.xpath("//p[@class='position']"));
		List<WebElement> Namelist = driver.findElements(By.xpath("//div[@class=\"team-information\"]"));
		
		List<WebElement> P = driver.findElements(By.xpath("//div[@class='row-head']//div[3]//p[@class='count']"));
		List<WebElement> wonlist = driver.findElements(By.xpath("//div[@class='row-head']//div[4]"));
		List<WebElement>L = driver.findElements(By.xpath("//div[@class='row-head']//div[5]//p[@class='count']"));
		List<WebElement> T = driver.findElements(By.xpath("//div[@class='row-head']//div[6]//p[@class='count']"));
		List<WebElement> Scrorediff= driver.findElements(By.xpath("//div[@class='row-head']//div[7]//p[@class='count']"));
		List<WebElement> formR1= driver.findElements(By.xpath("//ul[@class='form-listing']//li[1]"));
		List<WebElement> formR2= driver.findElements(By.xpath("//ul[@class='form-listing']//li[2]"));
		List<WebElement> formR3= driver.findElements(By.xpath("//ul[@class='form-listing']//li[3]"));
		List<WebElement> formR4= driver.findElements(By.xpath("//ul[@class='form-listing']//li[4]"));
		List<WebElement> formR5= driver.findElements(By.xpath("//ul[@class='form-listing']//li[5]"));
		List<WebElement> Points= driver.findElements(By.xpath("//div[@class='row-head']//div[9]//p[@class='count']"));
		
		Thread.sleep(1000);
	 for (int i = 0; i < Numbers.size(); i++) {
		        System.out.println( (i+1)+"."+Namelist.get(i).getText() + " -----P:" + P.get(i).getText()+ " --- Won:" + wonlist.get(i).getText()+ " ---L:" + L.get(i).getText()+ " --- T:" + T.get(i).getText()+ " --- Scrorediff:" + Scrorediff.get(i).getText()+ " --- formR1:" + formR1.get(i).getText()+ " --- formR2:" + formR2.get(i).getText()+ " --- formR3:" + formR3.get(i).getText()+ " --- formR4:" + formR4.get(i).getText()+ " --- formR5:" + formR5.get(i).getText()+ " --- Points:" + Points.get(i).getText());
		    }
		
		

	}

}
