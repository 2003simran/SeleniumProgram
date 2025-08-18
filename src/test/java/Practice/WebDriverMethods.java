package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {

		// LAunching empty browser
		WebDriver driver = new ChromeDriver();

		// Method1:-get()----->Launching the Application
		driver.get("https://www.amazon.in");

		// method2:-getTitle()--->Fetching the Title of the WebPage
		String title = driver.getTitle();
		System.out.println(title);

		// method3:-getCurrentUrl():---->Fetching the current url of the webpage
		// String url = driver.getCurrentUrl();
		 // System.out.println(url);

		// or
		System.out.println(driver.getCurrentUrl());

		// method4:-getPageSource()----->fetches the source code of the webpage
		String src = driver.getPageSource();
		// System.out.println(src);

		// method5:-manage
//	   Options opt = driver.manage();
//	   Window win = opt.window();
//	   win.maximize();

		// or
		// driver.manage().window().maximize();

		// driver.manage().window().minimize();

		driver.manage().window().fullscreen();

		// metho6:- close()--->closes the single tab/win where driver is currently in
		// focus
		// driver.close();

		// method7:- quit()---->closes all the tabs/wins including browser
		driver.quit();
	}

}
