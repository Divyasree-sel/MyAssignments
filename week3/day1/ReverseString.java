package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Testleaf@123";
		char[] strtochar=str.toCharArray();
		for (int i = strtochar.length-1; i >=0 ; i--) {
			System.out.print(strtochar[i]);
			
		}
		

	}

}
