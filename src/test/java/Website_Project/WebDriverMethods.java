package Website_Project;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		//webdriver is a core interface of selenium and they have 11 abstract methods+2 more methods.
		ChromeDriver driver = new ChromeDriver();
		//1.get(this helps to navigate to particular website and wait to load)
		 driver.get("https://www.toolsqa.com/");
		//2.getTilte(It is used to fetch the current page title)
		String title = driver.getTitle();
		System.out.println("Title of the page"+title);
		//3.getCurrentUrl(It is used to fetch url of the webpage)
		String url = driver.getCurrentUrl();
		System.out.println("Url of the website"+url);
		//4.getPagesource(It is used to fetch source code of the webpage)
//				String Src = driver.getPageSource();
//				System.out.println(Src);
		//5.navigate(It is used to perform different operations such as backward,forward,refresh,wait....etc in browsers history)
				//driver.navigate().forward();
				//driver.navigate().back();
				driver.navigate().refresh();
				//driver.navigate().to(url);
		//6.Manage(It is used to access options interfaces,which provide a way to manage various browser activity)
				//6.1(maximize the window)
				driver.manage().window().maximize();
				//6.2(minimize the window)
				driver.manage().window().minimize();
				//6.3(minimize the window)
				driver.manage().window().fullscreen();
				Thread.sleep(4000);
				//6.4(get and set position and size)
					//1.using get we fetch the position and size
						Point getpos = driver.manage().window().getPosition();
						System.out.println("postion of the screen"+getpos);
						System.out.println(" X postion of the screen"+getpos.getX());
						System.out.println(" X postion of the screen"+getpos.getY());
						Dimension getsize = driver.manage().window().getSize();
						System.out.println("size of the screen"+getsize);
						System.out.println(" hight of the screen"+getsize.getHeight());
						System.out.println(" width of the screen"+getsize.getWidth());
					//2.using set we set the position and size
						 Thread.sleep(3000);
					  driver.manage().window().setPosition(new Point(200, 500));
					  Thread.sleep(3000);
					  driver.manage().window().setSize(new Dimension(400, 500));
					  Thread.sleep(3000);
		//7.close(it is used to close the current tab/window where aur control is present)
				//driver.close();
		//8.quit(it is used to close the browser)
		driver.quit();

	}

}
