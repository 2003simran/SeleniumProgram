package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) {

//case2:- selenium version:-3.141.59 , webdrivermanager version:5.9.2

		// WebDriverManager.chromedriver().setup();
		// WebDriver driver=new ChromeDriver();

//	WebDriverManager.edgedriver().setup();
//	WebDriver driver=new EdgeDriver();

		// case3:- selenium version:-4.25.0 , webdrivermanager version:5.9.2

	//	WebDriverManager.firefoxdriver().setup();
	//	WebDriver driver = new FirefoxDriver();
		
		//case4:-selenium version:-4.25.0
		WebDriver driver=new ChromeDriver();
	}

}