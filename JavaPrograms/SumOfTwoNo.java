import java.io.InputStreamReader;	
import java.io.BufferedReader;	
import java.io.IOException;	
class SumOfTwoNo
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
	System.out.println("sum of "+x+" and "+y+" is="+(x+y));
}
}