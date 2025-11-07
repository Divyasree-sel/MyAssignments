package week3.day2;
public class Safari extends Browser{
	String browserName="IE";// OVERRIDING SUPERCLASS VALUE
	public void readerMode() {
		
		System.out.println("readerMode of "+browserName + " in Incognito mode");
	                    }
	public void fullSceenMode() {
		System.out.println("fullSceenMode of "+super.browserName +" "+ browserVersion);// calling SUPERCLASS VALUE
	                            }
	public static void main(String[] args) {
		Safari safari=new Safari();

		safari.openURL();//Browser- super class
		safari.fullSceenMode();//Safari-subclass
		safari.readerMode();//Safari-subclass
		
		
	                                       }
                                        }
