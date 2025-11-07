package week3.day2;
public class Browser {
// TODO Auto-generated method stub
		String browserName="CHROME";
		Double browserVersion=10.71;
		
		public void openURL() {
			System.out.println("OPEN URL OF : "+ browserName);
		
		                      }
		
		public void closeBrowser() {
			System.out.println("close the Browser OF : "+ browserName);
		                           }

		public void navigateBack() {
			System.out.println("navigateBack to  : "+ browserName +"of"+browserVersion);
		                           }
		
		public static void main(String[] args) {
			Browser Brow=new Browser();
			Brow.openURL();
			Brow.navigateBack();
		                                       }

	                     }


