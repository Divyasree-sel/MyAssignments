package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DDCreateleadDiffXpaths {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * Steps to handle the dropdown:
		 * 1)identify whether the dd elemnt is present in the<select>
		 * 2)if the element is present in the select tag ,locate the locate the element and store in a variable.
		 * 3)instantiate the select class and pass the webelement as an args to the constructor
		 * 4)with the object,use any helper method to locate the dropdown elemnt
		 */
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
//click crmsfa
		//driver.findElement(By.partialLinkText("SFA")).click();
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		//click createlead
		driver.findElement(By.linkText("Create Lead")).click();
		//companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//fname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("DIVYA");
		//lname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sree");
		//sourcedd
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//instantiate select class
Select sel=new Select(sourceDD);
		sel.selectByIndex(2);
		//industryDD
		WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sel1=new Select(industryDD);
		sel1.selectByValue("IND_AEROSPACE");
		//ownership-select by visible text
				WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select sel2=new Select(ownership);
				sel2.selectByVisibleText("LLC/LLP");
				//ATTRIBUTE BASED - xpath
			driver.findElement(By.xpath("//input[@id='createLeadForm_numberEmployees']")).sendKeys("2");
			//TEXT BASED - xpath-search
			driver.findElement(By.xpath("//button[text()='Search']")).click();
			//partial ATTRIBUTE BASED - xpath+collection based(index)-close search
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[contains(@class,'tool ')])[6]")).click();
			Thread.sleep(1000);
			//partial ATTRIBUTE BASED xpath ---create lead
			driver.findElement(By.xpath("(//input[contains(@type,'sub')])")).click();
			//PRINT TITLE AFTER STORING IN STRING
			String title1=driver.getTitle();
			System.out.println("Browser title :"+title1);
			
			//partial TEXT BASED - xpath+collection based(index)-LOGOUT
			driver.findElement(By.xpath("(//a[contains(text(),'Log')])[1]")).click();
			
			 
				//driver.findElement(By.linkText("Logout")).click();
	}

}
	