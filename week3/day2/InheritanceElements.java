package week3.day2;

public class InheritanceElements extends InheritanceButton {
	public  void setText(String text)
	{
		super.setText(text);
		super.setText(null);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritanceElements elements=new InheritanceElements();
		
		elements.setText("null2");//InheritanceWebElement class
		elements.SUBMIT();//InheritanceButton
		elements.click();//InheritanceWebElement class
 
	}

}
