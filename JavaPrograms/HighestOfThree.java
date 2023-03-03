class HighestOfThree
{
	public static void main(String ar[])
	{
		int x=Integer.parseInt(ar[0]);//10
		int y=Integer.parseInt(ar[1]);//30
		int z=Integer.parseInt(ar[2]);//20
	System.out.println("Program to print largerst of three");	
	int k=(x>y)?(x>z)?x:z:(y>z)?y:z;
	System.out.println("largest no. is = "+k+" from "+ x+" , "+y+" and "+z);
	}
}