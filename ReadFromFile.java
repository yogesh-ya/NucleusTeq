import java.io.File;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
class ReadFromFile
{
	public static void main(String ar[])
	{	
	FileInputStream input=null;
	try
	{
	File f=new File("Writablefile.txt");
	f.createNewFile();
	input=new FileInputStream("Writablefile.txt");
	Scanner sc=new Scanner(input);
	if(f.length()!=0)
	System.out.println(sc.nextLine());
	}
	catch(Exception e1)
	{
		System.out.println(e1);
	}
	}
}