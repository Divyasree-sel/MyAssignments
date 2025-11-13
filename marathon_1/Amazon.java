package marathon_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		// 1) Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		// 2) Load the Url https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		// maximize
		driver.manage().window().maximize();
		// Implicit/Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//3)03) Type "Bags for boys" in the Search box   ("bags for boys",Keys.Enter);
	     driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags for boys",Keys.ENTER);
	     //04) Choose the 	 item in the result (bags for boys)
	     //05) Print the total number of results (like 50000)
	       // 1-48 of over 50,000 results for "bags for boys"
	     String results = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none s-breadcrumb-header-text']")).getText();
	     System.out.println("Searh results: "+results);
	     //06) Select the first 2 brands in the left menu
	     driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[3]//label")).click();
	     driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left'])[4]//label")).click();
         //07) Choose New Arrivals (Sort)
	     driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
	     //08) Print the first resulting bag info (name, discounted price)
	     String firstBagname = driver.findElement(By.xpath("//span[contains(text(),'Casual Standard Backpack ')]")).getText();
	     System.out.println("firstBagname details : "+firstBagname);
	     String priceSymbol = driver.findElement(By.xpath("//span[@class='a-price-whole']//preceding-sibling::span")).getText();
	     String discountedPrice = driver.findElement(By.xpath("//span[@class='a-price-symbol']//following-sibling::span")).getText();
         System.out.println("Discounted Prie : "+priceSymbol+discountedPrice);
         //09) Get the page title and close the browser(driver.close())
           String pageTitle = driver.getTitle();
           System.out.println("Page title : "+pageTitle);
           driver.close();

		
		
		
		
		
		
		
		
                          }
                                              }
