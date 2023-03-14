//throw a a custom exception
//Requirement : if the age is below 18 we will throws custom exception
class InvalidAgeException extends RuntimeException
{
	InvalidAgeException()
	{
		
	}
	
	InvalidAgeException(String s)
	{
		super(s);
	}
}
class ThrowKeword1
{
	public static void main(String ar[])
	{
	int age=Integer.parseInt(ar[0]);
	if(age<18)
	{
		InvalidAgeException invalidage=new InvalidAgeException(age+" is not valid age");
		throw invalidage;
	}
	else
	{
		System.out.println("Welcome");
	}
	}
}