import java.util.Scanner;
class SimpleInterest
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Simple Interest Program");
		System.out.println("Enter principal amount");
		float principal=sc.nextFloat();
		System.out.println("Enter rate of interest");
		float rate=sc.nextFloat();
		System.out.println("Enter Time");
		float time=sc.nextFloat();
		float SimpleInterest=(principal*rate*time)/100;
		System.out.println("The Simple Interst is:"+SimpleInterest);
		System.out.println("The Amount is:"+(principal+SimpleInterest));
		
	}
}