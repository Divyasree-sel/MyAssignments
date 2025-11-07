package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SingleLevelInherit_TestData {
	public void enterCredentials()
	{
		
		System.out.println("Credentials will be entered now"); //Message displayed to user.
		
	}
	public void navigateToHomePage() throws InterruptedException {
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
		String title= driver.getTitle();
		System.out.println("webpage title : "+title);
		Thread.sleep(2000);
		driver.close();
		
		
	                                 }}
