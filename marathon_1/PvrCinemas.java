package marathon_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PvrCinemas {
	public static void main(String[] args) {
		// 1) Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		// 2) Load the Url "https://www.pvrcinemas.com/"
		driver.get("https://www.pvrcinemas.com");
		// maximize
		driver.manage().window().maximize();
		// Implicit/Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// 3) //Choose Your location as "Chennai"
		// parent to child--select location
		driver.findElement(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']/span")).click();
		// --select chennai
		driver.findElement(By.xpath("//h6[text()='Chennai']/parent::div")).click();

		// 4) Click on Cinema under Quick Book-elder sibling to younger sibling
		driver.findElement(By.xpath("//span[@class='filter-pvr-active']/following-sibling::span")).click();

		// 5)click on select cinema option
		driver.findElement(By.xpath("//span[text()='Select Cinema']/parent::div")).click();
		
		// click on select the required cinema
			
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[4]//span")).click();
		
		// 6) Select Your Date as 
		  
			driver.findElement(By.xpath("(//span[contains(text(),'Today')])//parent::li")).click();
		// 7) Select Your Movie
			  
			driver.findElement(By.xpath("(//span[text()='PREDATOR: BADLANDS'])/parent::li")).click();
		// 8) Select Your Show Time
			  
			driver.findElement(By.xpath("(//span[text()='Tamil'])//parent::li")).click();
			
		// 9) Click on Book Button
			  
			driver.findElement(By.xpath("//button[@class='p-button p-component sc-hjsuWn kDwaXw bgColor filter-btn']/span")).click();
			
		// 10) Click Accept on Term and Condition
			  
			 driver.findElement(By.xpath("//button[text()='Accept']")).click();
		// 11) Click any one available seat
			  
			  driver.findElement(By.xpath("//span[@id='EL.ELITE|H:1']")).click();
			  
        // 12) Click Proceed Button
			  
			  driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		// 13) Print the Seat info under book summary
			  String seatNo = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		      System.out.println("seatno is : "+seatNo);
		// 14) Print the grand total under book summary
		     String grandtTotal =driver.findElement(By.xpath("//div[@class='grand-prices']//h6")).getText();
		      System.out.println("GrandTotal : "+grandtTotal);
		  //15) Click Continue  
			 driver.findElement(By.xpath("//div[@class='register-btn']/button")).click();
		 //16) Close the popup
			 driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		 // 17) Print Your Current Page title
		     String title =driver.getTitle();
		     System.out.println("Title : "+title);
		  //18) Close Browser 
			 driver.close();
				
					
	}
}
