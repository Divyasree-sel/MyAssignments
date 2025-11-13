package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection_ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        //First array
				int[] arr1 = {3, 2, 11, 4, 6, 7};
				
				//Second array
				int[] arr2 = {1, 2, 8, 4, 9, 7};
				
				// first list for first array values
				List<Integer> arrList1=new ArrayList<Integer>();
				
				// Second list for Second array values
				List<Integer> arrList2=new ArrayList<Integer>();
				
				//Adding array1 elements through for loop in to the arraylist
				
				for (int i = 0; i < arr1.length; i++) 
				{
					arrList1.add(arr1[i]);
				}
				//Adding array1 elements through for loop in to the arraylist
				
				for (int i = 0; i < arr2.length; i++) 
				{
					arrList2.add(arr2[i]);
				}
				System.out.println("Arraylist1 elements :"+arrList1);
				System.out.println("Arraylist2 elements :"+arrList2);
               // Finding Intersection between two arraylist through iteration
			
				
				for (int k = 0; k < arrList1.size(); k++) 
				{
				
				//Adding array1 elements through for loop in to the arraylist
				
				for (int l = 0; l < arr2.length; l++)
					
				{
					
					if(+arrList1.get(k)==arrList2.get(l))
					{
					System.out.println("Common values are "+arrList1.get(k));
					List<Integer> arrList3=new ArrayList<Integer>();
				    arrList3.add(arrList1.get(k));
					System.out.println(arrList3);
					}
					
					
					
					
				}
				
				}
					
				
				

	                                       }

                                             }
