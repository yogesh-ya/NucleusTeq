// 7.Write a Java program that takes three numbers as input to calculate and print the average of the numbers
import java.io.InputStreamReader;	
import java.io.BufferedReader;	
import java.io.IOException;	
class AverageOfThreeNo
{
	public static void main(String ar[])throws IOException
	{
	InputStreamReader ir=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ir);
	System.out.println("Enter value of x");
	String s1=br.readLine();
	System.out.println("Enter value of y");
	String s2=br.readLine();
	System.out.println("Enter value of z");
	String s3=br.readLine();
	int x=Integer.parseInt(s1);
	int y=Integer.parseInt(s2);
	int z=Integer.parseInt(s3);
	System.out.println("Average of "+x +" " +y+" " +z +" is="+(x+y+z)/3);
	}
}