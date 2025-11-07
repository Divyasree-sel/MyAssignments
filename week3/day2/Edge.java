package week3.day2;

public class Edge extends Browser{
	public void takeSnap() {
			System.out.println("takeSnap of"+browserName + "in Incognito mode");
		                    }
		public void clearCookies() {
			System.out.println("clearCookies of"+browserName + browserVersion);
		                            }
		public static void main(String[] args) {
			Edge edge=new Edge();
			edge.openURL();
			
			
		                                       }

		                                    }

