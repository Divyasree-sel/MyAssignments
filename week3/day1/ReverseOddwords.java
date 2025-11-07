package week3.day1;

public class ReverseOddwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] split=test.split(" ");
          System.out.println(test); 
	     for(int i=0;i<split.length;i++)
	    	 if(i%2!=0) {
	    		 //System.out.println("odd index of string"+i+" :"+split[i]);
	    		char[] splitChar= split[i].toCharArray();
	    		for(int j=splitChar.length-1;j>=0;j--)
	     System.out.print(splitChar[j]);
	    	            }
	    	 else
	    		 System.out.print(" "+split[i]+" "); 
	    
	                                        }

                                   }
