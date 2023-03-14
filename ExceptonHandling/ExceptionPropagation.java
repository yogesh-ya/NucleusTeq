//Exception propgation using throws keyword
import java.io.FileNotFoundException;
import java.io.PrintWriter;
class ExceptionPropagation
{
		static void show2()throws FileNotFoundException
		{
			PrintWriter pw=new PrintWriter("xyz.txt");
		}
		static void show1()throws FileNotFoundException
		{
			show2();
		}
	public static void main(String ar[])throws FileNotFoundException
	{
		show1();
		System.out.println("Softwaves_1");
	}
}