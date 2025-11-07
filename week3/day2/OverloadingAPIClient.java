package week3.day2;

public class OverloadingAPIClient {
	//Creating a method with single input argument.
	public void sendRequest(String endpoint)
	{
		System.out.println("Single arg method "+ endpoint);
	}
	
	//Creating a method with multiple input argument.(Over loading)
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
	{
		System.out.println("Multiple arg method "+ endpoint+" "+requestBody+" "+requestStatus);
	}
	//Call both versions of the sendRequest method
	public static void main(String[] args) {
		OverloadingAPIClient Overload =new OverloadingAPIClient();
		Overload.sendRequest("LOGIN");
		Overload.sendRequest("Login_1", "BODY", false);
	                                       }
                        }
