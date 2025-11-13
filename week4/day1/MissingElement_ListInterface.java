package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MissingElement_ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating a array
		int[] arrA = {1, 2, 3, 4, 10, 6, 8};
		//creating a array List (collection
         List<Integer> arrAList=new ArrayList<Integer>();
         //Adding array elements to collection array list through iteration loop
         for (Integer i : arrA) 
         {
         arrAList.add(i);
         
		 }
         System.out.println("arrAList : "+arrAList);
         Collections.sort(arrAList);
         System.out.println("Sorted arrAList : "+arrAList);
         System.out.println("size of array list : "+arrAList.size());
         System.out.println("--------------------------------------- ");
         for (int j = 0; j <arrAList.size()-1; j++) 
         {
			
		
        	int currlist=arrAList.get(j);
        	int nextlist=arrAList.get(j+1);
        	
        	
        	//check if Current element+1=Next element, if not consider it is missing sequence element
         	
         	// k=1+1=2,;2<2-> false 
         	//,true executable condition k=4+1=5;5<6 K=5 is missing
         	for (int k=currlist+1;k<nextlist;k++)
        	{
         		System.out.println("current Element list : "+currlist);
             	System.out.println("Next Element list: "+nextlist);
             	System.out.print(" <<< ");
        		System.out.print("Missing Sequence Element : "+k);
        		System.out.println(" >>> ");
        	}
         	
         	
         }
         
         
         
	                                            }

                                                       }
