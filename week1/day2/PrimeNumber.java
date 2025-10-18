package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Print prime numbers till");
		
		
		for (int num = 2; num <= 198; num++) {
			boolean b = true;
		for (int j = 2; j <num/2;j++) {
			if (num % j == 0) {
				b = false;
			} 
			break;
			}
		
		
		if (b == true) {
			System.out.println("Prime Number"+":"+num);
		} else {
			System.out.println("Not a Prime Number"+":"+num);
		}

	}
	}
}

