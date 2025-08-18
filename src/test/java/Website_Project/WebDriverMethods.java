package Website_Project;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		//webdriver is a core interface of selenium and they have 11 abstract methods+2 more methods.
		ChromeDriver driver = new ChromeDriver();
		//1.get(this helps to navigate to particular website and wait to load)
		 driver.get("https://www.toolsqa.com/");
		//2.getTilte(It is used to fetch the current page title)
		String title = driver.getTitle();
		System.out.println(title);
		//3.getCurrentUrl(It is used to fetch url of the webpage)
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//4.getPagesource(It is used to fetch source code of the webpage)
				String Src = driver.getPageSource();
				System.out.println(Src);
		//navigate(It is used to perform different operations such as backward,forward,refresh,wait....etc in browsers history)
				//driver.navigate().forward();
				//driver.navigate().back();
				driver.navigate().refresh();
				//driver.navigate().to(url);
		//6.Manage(It is used to access options interfaces,which provide a way to manage various browser activity)
				//5.1(maximize the window)
				driver.manage().window().maximize();
				//5.2(minimize the window)
				driver.manage().window().minimize();
				//5.3(minimize the window)
				driver.manage().window().fullscreen();
				//5.44(get and set position and size)
				
		//12.close(it is used to close the current tab/window where aur control is present)
				//driver.close();
		//13.quit(it is used to close the browser)
		driver.quit();

	}

}
