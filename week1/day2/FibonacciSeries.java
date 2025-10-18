package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; // number of terms to print
	    int first = 2, second = 1;

	    System.out.println("Fibonacci Series up to " + n + " terms:");

	    for (int i = 1; i <= n; i++) {
	        System.out.print(first + " ");

	        // calculate next term
	        int next = first + second;
	        first = second;
	        second = next;
	    }
	}

	}

