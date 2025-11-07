package week3.day2;


public class SingleLevelInherit_LogInTestData extends SingleLevelInherit_TestData{
	
	public void enterCredentials()
	{
		
		super.enterCredentials();
		System.out.println("Parent class overriding");
	
	}
	
	public void enterUsername()
	{
		
		System.out.println("enterUsername"); 
		
	}
	
	public void enterPassword()
	{
		
		System.out.println("enterPassword"); 
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		SingleLevelInherit_LogInTestData singleLevelInherit=new SingleLevelInherit_LogInTestData();
		singleLevelInherit.enterCredentials();//super class-SingleLevelInherit_TestData
		singleLevelInherit.enterUsername();//subclass-SingleLevelInherit_LogInTestData
		singleLevelInherit.enterPassword();//subclass-SingleLevelInherit_LogInTestData
		singleLevelInherit.navigateToHomePage();//super class-SingleLevelInherit_TestData
		
	
                                                                   }
                                                       }

