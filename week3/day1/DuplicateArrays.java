package week3.day1;

import java.util.Arrays;

public class DuplicateArrays {

	public static void main(String[] args) {
		String[] words= {"SATELLITE","sATELLITE","sATELLITE","SATELLITE","Moon","Earth"};
		
	for (int i=0;i<words.length;i++) {
		for (int j=i+1;j<words.length;j++) {
			if (words[i]==words[j]) {
			System.out.println("Duplicates:"+i+" "+words[i]);
			}
			}
	}
		
		int [] num=  {99,10,35,46,10,99};
		Arrays.sort(num);
		
		for (int k = 0;k<num.length-1;k++) {
	if (num[k]==num[k+1]) {
				System.out.println("Duplicates:"+k+" "+num[k]);
				}
	
		}
		
		}			
	}	

	
		


