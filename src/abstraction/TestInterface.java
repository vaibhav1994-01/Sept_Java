package abstraction;

import abstraction.WebDriver.ChromeDriver;
import abstraction.WebDriver.FirefoxDriver;

public class TestInterface {
		public static void main(String[]args){
		WebDriver driver = new ChromeDriver();
		driver.openBrowser();
		driver.closeBrowser();

		WebDriver driver1 = new FirefoxDriver();
		driver1.openBrowser();
		driver1.closeBrowser();
		}
		}

