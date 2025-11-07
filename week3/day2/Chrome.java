package week3.day2;

public class Chrome extends Browser {
public void openIncognito() {
	System.out.println("open"+browserName + "in Incognito mode");
                             }
public void clearCache() {
	System.out.println("clear cache of"+browserName + browserVersion);
                             }
public static void main(String[] args) {
	Chrome chrome=new Chrome();
	chrome.openURL();
	chrome.navigateBack();
	chrome.openIncognito();
	chrome.clearCache();
                                       }

                                       }
