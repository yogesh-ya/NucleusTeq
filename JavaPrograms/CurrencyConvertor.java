import java.util.*;
class CurrencyConvertor
{
	public static void main(String ar[])
	{
	
	System.out.println("Program of Currency Conversion");
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the amount");
	float amount=sc.nextFloat();
	System.out.println("Please enter your choice");
	System.out.println("Press 1 for INR(Indian Rupee) to US Dollars");
	System.out.println("Press 2 for UD Dollars to INR(Indian Rupee) Dollars");
	System.out.println("Press 3 for INR to PKR(Pakistan Rupee)");
	System.out.println("Press 4 for PKR(Pakistan Rupee) to INR(Indian Rupee)");
	System.out.println("Press 5 for INR(Indian Rupee) to CAD(Canadian Dollar)");
	System.out.println("Press 6 for CAD(Canadian Dollar) to INR(Indian Rupee)");
	int x=sc.nextInt();
	switch(x)
	{
		case 1:
		{	
			amount=amount/83;
			System.out.println(amount+" US Dollars");
		break;
		}
		case 2:
		{	
			amount=amount*83;
			System.out.println(amount+" INR");
		break;
		}
		case 3:
		{	
			amount=amount*3.14f;
			System.out.println(amount+" INR");
		break;
		}
		case 4:
		{	
			amount=amount/3.14f;
			System.out.println(amount+" PKR");
		break;
		}
		case 5:
		{	
			amount=amount/60.87f;
			System.out.println(amount+" CAD");
		break;
		}
		case 6:
		{	
			amount=amount*60.87f;
			System.out.println(amount+" INR");
		break;
		}
		default:
			System.out.println("Invalid Choice");
			break;
	}
	}
}