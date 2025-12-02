package abstraction;

interface WebDriver{
		void openBrowser();
		void closeBrowser();

		class ChromeDriver implements WebDriver{
		public void openBrowser(){
		System.out.println("Opening Chrome Browser");
		}
		public void closeBrowser(){
		System.out.println("Closing Chrome Browser");
		}
		}

		class FirefoxDriver implements WebDriver{
		public void openBrowser(){
		System.out.println("Opening Firefox Browser");
		}
		public void closeBrowser(){
		System.out.println("Closing Firefox Browser");
		}
		}

		
}
