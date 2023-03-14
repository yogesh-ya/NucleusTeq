import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
class ReadFromFile
{
	public static void main(String ar[])
	{	
	try
	{
	input=new FileInputStream("Writablefile.txt");
	Scanner sc=new Scanner(input);
	System.out.println(sc.nextLine());
	}
	catch(FileNotFoundException e1)
	{
		System.out.println(e1);
	}
	}
}