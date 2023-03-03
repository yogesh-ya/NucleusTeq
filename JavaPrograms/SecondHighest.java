class SecondHighest
{
	public static void main(String ar[])
	{
		int x[]={-2,-4,-21,-2,-20,-1-0,-9,-1,-0};
		int Highest=Integer.MIN_VALUE;//-2147483648
		int Second_Highest=Integer.MIN_VALUE;//-2147483648
		for(int i=0;i<x.length;i++)
		{
			if(Highest<x[i])
			{
				Second_Highest=Highest;
				Highest=x[i];
			}
			else if(Second_Highest<x[i]&&Second_Highest!=Highest)
			{
				Second_Highest=x[i];
			}
		}
		System.out.println(Second_Highest);
	}
}