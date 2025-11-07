package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn Java basics as part of java sessions in java week1";
		//Initialize a variable ‘count’ to keep track of the number of duplicate words found
		int count =0;
		//Split the text into an array of words using space as the delimiter
		String[] splitText=text.split(" ");
               for (int i=0;i<splitText.length;i++)
            	   
               {
            	   //System.out.println(splitText[i]); 
            	   for(int j=i+1;j<splitText.length;j++)
            	   {
            		   //comparing the string data
            		   if (splitText[i].equalsIgnoreCase(splitText[j]))
            		   {
            			   //replacing matching word with space
            			   splitText[j]="";
            			  count++;
            			 
            		   }
            		     
            	   }
            	  
               }
               // checking the duplicate count 
               if (count>0)
               {
            	   System.out.print("Removal of duplicate words : ");
            	   for(String splitTexts:splitText)
            	   System.out.print(splitTexts+" ");
               }
	              
	                                                }

                                   }
