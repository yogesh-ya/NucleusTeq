//File handling
// 1.create a file 
import java.io.File;
class FileHandlingOperations
{
	public static void main(String ar[])
	{
		File f1=null;
		try
		{
	    f1=new File("file1.txt");

	if(f1.createNewFile())
	{
		System.out.println("New File created");
	}
	else
	{
		System.out.println("File already exist");
	}
		}
	catch(Exception e1)
	{
		System.out.println(e1);
	}
	}
}