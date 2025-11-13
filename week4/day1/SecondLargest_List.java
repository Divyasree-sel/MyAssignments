package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest_List {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating a array
		int[] arrA = {3, 2, 11, 4, 6, 7};
		//creating a array List (collection
         List<Integer> arrAList=new ArrayList<Integer>();
         //Adding array elements to collection array list through iteration loop
         for (Integer i : arrA) 
         {
         arrAList.add(i);
         
		 }
         System.out.println("arrAList : "+arrAList);
         //Default sort : ascending order size(i)-2 would be 2nd largest as index starts with '0'
         Collections.sort(arrAList);
         
         System.out.println("Sorted arrAList : "+arrAList);
         int ArrSize=arrAList.size();
         System.out.println("size of array list : "+ArrSize);
         System.out.println("--------------------------------------- ");
         System.out.println("Secong largest number from sorted array list  : "+arrAList.get(ArrSize-2));
         

	                                                }
                                                         }

//SecondLargest_List
