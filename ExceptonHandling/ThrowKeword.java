//throw a checked Exception
//Requirement : if the age is below 18 we will throws arithmatic exception
class ThrowKeword
{
	public static void main(String ar[])
	{
	int age=Integer.parseInt(ar[0]);
	if(age<18)
	{
		ArithmeticException ae=new ArithmeticException(age+" is not valid age");
		throw ae;
	}
	else
	{
		System.out.println("Valid Age");
	}
	}
}