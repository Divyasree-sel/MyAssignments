package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling_Interaction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");	
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize
		driver.manage().window().maximize();
		//enter uname
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		// login-absolute xpath
	     driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[1]/a[1]")).click();

	        //click contacts option
			driver.findElement(By.linkText("Contacts")).click();
			
			//click merge contact button
			driver.findElement(By.linkText("Merge Contacts")).click();
			
			 
			
			//click on widget of the "From Contacts"
			driver.findElement(By.xpath("(//a/img[@alt='Lookup'])[1]")).click();
			
			// Get current window handle (Parent)
	        String parentWindow = driver.getWindowHandle();
			
			//storing all the windows
			Set<String> allWindows = driver.getWindowHandles();
			
			//Store into the list
			List<String> windowList=new ArrayList<String>(allWindows);
			
			//Switching to child window
			for (String childWindows : allWindows) {
				if (!childWindows.equals(parentWindow)) {
					driver.switchTo().window(childWindows);
				}
			}
			//maximize the new window
			driver.manage().window().maximize();	
			
			//click the first value
			driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//td[contains(@class,'cell-first ')]//a)[1]")).click();
			
			//Again switch to parent window
			driver.switchTo().window(parentWindow);
			
			//Now click the widget of the "To Contact".
			driver.findElement(By.xpath("(//a/img[@alt='Lookup'])[2]")).click();
			
			//wait for sometime
			Thread.sleep(3000);
			
			//Again store the all windows into the Set
			Set<String> allWindows1 = driver.getWindowHandles();
			
			//Now create the list and store the set values
			List<String> listWindow1=new ArrayList<String>(allWindows1);
			
			//Switch to child window
			for (String childWindows : allWindows1) {
				if (!childWindows.equals(parentWindow)) {
					driver.switchTo().window(childWindows);
				}
			}
			
			//Maximize the window
			driver.manage().window().maximize();
			
			
			//Now click the second option
			driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//td[contains(@class,'cell-first ')]//a)[2]")).click();
			
			//Now switch to the parent window again
			driver.switchTo().window(parentWindow);
			
			
			//click merge button
			driver.findElement(By.linkText("Merge")).click();
			
			//swith to the control to alert
			Alert alert = driver.switchTo().alert();
			
			//Accept the alert
			alert.accept();
			
			//Print the current window title
			String currentWindowTitle = driver.getTitle();
			System.out.println("Current Window Title Is : "+currentWindowTitle);
			
			//close the browser
			driver.close();
	                                       }

                                          }
