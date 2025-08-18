package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsEx {

	public static void main(String[] args) {

		// Launching Empty Browser(Selenium version:-4.25.0)
		WebDriver driver = new ChromeDriver();

		// Method1:-get()---->launching web Application
		driver.get("https://www.amazon.in");

		// method2:-getTitle()---->fetches the title of the webpage
		String title = driver.getTitle();
		System.out.println(title);

		// method3:-getCurrentUrl()---->fetches the URL of the webpage
		String URL = driver.getCurrentUrl();
		System.out.println(URL);

		// method4:-getPageSource()---->fetches the source code of the webpage
		String src = driver.getPageSource();
		// System.out.println(src);

		// method5:-manage()--->maximize
//	    Options opt = driver.manage();
//	    Window win = opt.window();
//	    win.maximize();

		// or
		// driver.manage().window().maximize();

		// driver.manage().window().minimize();

		// driver.manage().window().fullscreen();

//		 Dimension size = driver.manage().window().getSize();
//		System.out.println(size);
//		System.out.println(size.getHeight());
//        System.out.println(size.getWidth());

		// driver.manage().window().maximize();

//		Dimension size1 = driver.manage().window().getSize();
//		System.out.println(size1);
//		System.out.println(size1.getHeight());
//        System.out.println(size1.getWidth());

		// Dimension size = new Dimension(800, 800);
		// driver.manage().window().setSize(size);

		// or
		// driver.manage().window().setSize(new Dimension(800, 500));

		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		System.out.println(position.getX());
		System.out.println(position.getY());

		// driver.manage().window().setPosition(new Point(600, 500));
	}

}