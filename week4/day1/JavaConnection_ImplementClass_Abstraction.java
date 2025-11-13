package week4.day1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaConnection_ImplementClass_Abstraction implements DatabaseConnection_Interface_Abstraction  {
	ChromeDriver driver = new ChromeDriver();
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection_ImplementClass_Abstraction java=new JavaConnection_ImplementClass_Abstraction();
		java.connect();
		java.disconnect();
		java.executeUpdate();
		
	                                       }
  //Unimplemented methods are called here with annotation of @override
	//Implemented methods cannot be override here in abstract class disconnect(); & executeUpdate();
	//used @SuppressWarnings("static-access") to ger overridden static method in this class
	
	@Override
	public  void connect() {
		String Name="facebook";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println("Connect to the "+Name+" : "+title);
		
	                      }
	 public static void disconnect() {
		 double version=1.5;
			System.out.println("Disconnect the DB "+version);
			
		                                 }

                                                                                                               }
