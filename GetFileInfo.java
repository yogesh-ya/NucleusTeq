import java.io.File;
import java.io.IOException;
class GetFileInfo
{
	public static void main(String ramji[])throws IOException
	{
		//Object of file is created
		File file2=new File("myfile3.txt");
		
		//new File is create
		System.out.println("Here the new File is : "+file2.createNewFile());
		
		//getting the file name
		System.out.println("Here the file name is : "+file2.getName());
		
		//file is writable or not
		System.out.println("is file writable? : "+file2.canWrite());
		
		//file is writable or not
		System.out.println("is file readable? : "+file2.canRead());
		
		//get the length of file
		System.out.println("is file readable? : "+file2.length());
		
	}
}
