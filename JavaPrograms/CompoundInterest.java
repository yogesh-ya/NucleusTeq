//Math.pow(a,b)
//A =p*(1+(r/100))power n
import java.util.Scanner;
class CompoundInterest
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Compound Interest Program");
		System.out.println("Enter principal amount");
		double principal=sc.nextFloat();
		System.out.println("Enter rate of interest");
		double rate=sc.nextFloat();
		System.out.println("Enter Time");
		double time=sc.nextFloat();
		double Amount=principal*(Math.pow(1+(rate/100),time));
		System.out.println("The Compound Interst is:"+(float)(Amount-principal));
		System.out.println("The Amount is:"+(float)Amount);
		
	}
}