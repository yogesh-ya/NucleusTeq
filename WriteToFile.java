import java.io.FileWriter;
import java.io.IOException;
class WriteToFile
{
	public static void main(String ar[])
	{	
		//creating Object of FileWriter
		try
		{
		FileWriter file=new FileWriter("Writablefile.txt");
		String s1="This is the first file I am writing";
		
		//Writing to a file
		file.write(s1);
		System.out.println("Data inserted");
		
		//closing a file
		file.close();
		}
		catch(IOException e1)
		{
			System.out.println("Unexpected error came");
			System.out.println(e1);
		}
		
	}
}