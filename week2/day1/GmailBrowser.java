package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class GmailBrowser {

	

		public static void main(String[] args)  {
			
			//instantiate the browser driver
			ChromeDriver driver=new ChromeDriver();
			
			//FirefoxDriver driver1=new FirefoxDriver();
			//load theurl
			driver.get("http://mail.google.com");
			//maximize
			driver.manage().window().maximize();
			//get the title of the page
			//String title = driver.getTitle();
			System.out.println(driver.getTitle());
			
			driver.close();

		}
	}


	