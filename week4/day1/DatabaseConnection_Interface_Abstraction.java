package week4.day1;

public interface DatabaseConnection_Interface_Abstraction {
	//Void--No method implementation
	public void connect() ;
	//static-- method implementation(with body) is allowed
	public static void disconnect() {
		System.out.println("Disconnect the DB ");
		
	                                 }
	//default-- method implementation(with body) is allowed
	public default void executeUpdate() {
		System.out.println("Execute the updated data in the DB  ");
	                                     }
	
	

                                                 }
