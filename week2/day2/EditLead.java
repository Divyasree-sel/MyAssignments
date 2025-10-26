package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {


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
			//click createlead option
			driver.findElement(By.linkText("Create Lead")).click();
			//companyname
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf_2");
			//fname
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("DIVYA_2");
			//lname
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sree_1");
			// click to do create lead button
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			// click to do find  lead link
			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			// click to name and id
						driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
						
						// enter FN
						driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("DIVYA_2");

						//CLICK ON FIND LEADS BUTTON
						driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
						//CLICK ON first name details in lead list
						Thread.sleep(1000);
						driver.findElement(By.xpath("//a[text()='DIVYA_2']")).click();
						Thread.sleep(1000);
						
						//CLICK ON edit button
						driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
						//fname
						driver.findElement(By.xpath("//input[@id='updateLeadForm_firstName']")).sendKeys("DIVYA_2.1");
						//CLICK ON update button
						driver.findElement(By.xpath("//input[@value='Update']")).click();
						
		}
}
						
						
						
						
			
	
