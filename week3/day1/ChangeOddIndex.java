package week3.day1;

public class ChangeOddIndex {
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		//Convert the given String to a character array.
		char[] test1 = test.toCharArray();
		for(int i=0;i<test1.length;i++)
		{
			if (i%2!=0)
			{
				char Upper = Character.toUpperCase(test1[i]);
				
				System.out.println("Odd char are changed to upper case : "+i+" "+Upper);
				
			
			}
		}

	                                        }

                              }
