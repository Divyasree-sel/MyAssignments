package week3.day1;

import java.util.Arrays;

public class MissingArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Input= {1,4,3,2,8,6,7};
	     //Sort the Arrays
         Arrays.sort(Input);
         for(int num:Input) {
        	 System.out.println("sorted arrays "+ num);
                          }
         for (int i=0;i<Input.length-1;i++) {
        	 System.out.println("length "+Input.length);
				/*
				 * System.out.println("1: "+Input[i]); System.out.println("2: "+Input[i+1]); 
				 * ; System.out.println("3: "+num1 );
				 * 
				 */	
        	 //checking the missing consecutive num
        	 int num1=Input[i]+1;
				if (Input[i+1]!=num1)
				{
					System.out.println("MISSING VALUE is "+ num1);
					break;
				}
				  }
	                                         

                                            }
                                     }
