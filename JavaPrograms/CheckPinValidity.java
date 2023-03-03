/*java program to checkk valid i/p pin num. format -ex 443122
It can be only six digits.
It should not start with zero.
First digit of the pin code must be from 1 to 9.
Next five digits of the pin code may range from 0 to 9.*/

import java.util.regex.*;
class CheckPinValidity
{	public static boolean checkPin(String mypin)
	{
		 String pinformat= "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
		 if(mypin==null)return false;
		 
		 //Pattern class has compile method to define pinformat as regular expression pattern 
		 Pattern p = Pattern.compile(pinformat);
		 //pattern class has matcher() method to check given pin matches with regular expression pattern or not
		 Matcher m=p.matcher(mypin);
		 //Matcher class matches() method return true if both pattern and pin mathches otherwise return false
		 return m.matches();
	}
	public static void main(String a[])
	{
	String mypin=a[0];	
	System.out.println("Pin is="+checkPin(mypin));
	}
	
}