package week4.day2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Sorting_Collection_List {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		    //String values
				String[] values = {"HCL", "Wipro", "Aspire Systems", "CTS"};
				
				//List creation
				List<String> stringList = new ArrayList<String>();
				
				//Adding values to the List through iterator
				for (String i : values) 
				
			   {
					stringList.add(i);
				}
				
				//print the list before sort
				System.out.println("stringList : "+stringList);
				
				//sorting the list using Collections.sort
				Collections.sort(stringList);
				System.out.println("sorted stringList : "+stringList);
				System.out.print("Reverse order of sorted stringList : ");
				//Print reverse String
				for (int i = stringList.size()-1; i >= 0; i--) {
					
					
					System.out.print(stringList.get(i)+" ");
				}
               
	}

}
