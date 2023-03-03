// 6.Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
import java.io.InputStreamReader;	
import java.io.BufferedReader;	
import java.io.IOException;	
class ArithmaticOperation
{
	public static void main(String ar[])throws IOException
	{
	InputStreamReader ir=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ir);
	System.out.println("Enter value of x");
	String s1=br.readLine();
	System.out.println("Enter value of y");
	String s2=br.readLine();
	int x=Integer.parseInt(s1);
	int y=Integer.parseInt(s2);
	System.out.println("Sum of "+x+" and "+y+" is="+(x+y));
	System.out.println("Multiply of "+x+" and "+y+" is="+(x*y));
	System.out.println("Subtract of "+x+" and "+y+" is="+(x-y));
	System.out.println("Remainder of "+x+" and "+y+" is="+(x%y));
}
}