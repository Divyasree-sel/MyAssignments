package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Myntra {

	private static int size;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//creating object & launch the browser
				ChromeDriver driver = new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				
				//wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//load the URL
				driver.get("https://www.myntra.com/");
				
				//search the bags
				driver.findElement(By.xpath("//div[@class='desktop-query']/input[@class='desktop-searchBar']")).sendKeys("Bags",Keys.ENTER);
				Thread.sleep(2000);
				// men filter
				driver.findElement(By.xpath("(//label[contains(@class,'gender-label')])[1]")).click();
				Thread.sleep(2000);	
				//Under the "Category" select "Laptop Bags"
				driver.findElement(By.xpath("//label[contains(text(),'Laptop Bag')]")).click();
				Thread.sleep(2000);
				//Print the Bag-  items
				String bagItemCount = driver.findElement(By.xpath("(//div[@class=' row-base'])[2]")).getText();
				System.out.println("Laptop Bag Item Count : "+bagItemCount);
				//click on more under Brand 
				
				driver.findElement(By.xpath("(//span[text()='Brand']//following-sibling::div)[2]")).click();
				Thread.sleep(2000);
				//get  all brandnames
				List<WebElement> brands = driver.findElements
						(By.xpath("//ul[@class='FilterDirectory-list']//label[contains(@class,'common-customCheckbox')]"));
			    
				//create empty list to store the bag names
				List<String> brandNameList = new ArrayList<String>();
				
				//using for each loop to iterate the values and add to the list
				for (WebElement brand  : brands) {
					String brandNames = brand.getText().split("\\(")[0].trim();
					
					brandNameList.add(brandNames);
					
					
				}
				size = brandNameList.size();
				System.out.println("Brand Names :"+brandNameList);
				System.out.println("Total No. of Brands :"+size);
				
				//close the brand screen
				driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
				
				
				//Store the brand list into the List
				List<WebElement> bagLists = driver.findElements(By.xpath("//h3[@class='product-brand']"));
				
				//create a empty list
				List<String> bagNames = new ArrayList<String>();
				
				//iterate the list using for each and store the bag names into the list
				for (WebElement bags : bagLists) {
					String bagValues = bags.getText();
					bagNames.add(bagValues);
				}
				
				//print the entire bag name list
				System.out.println("List Of Bag Names Are Below : ");
				System.out.println(bagNames);
				
				//close the browser
				driver.quit();
				
				
				
				

	}

}
