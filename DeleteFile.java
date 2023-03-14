import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class DeleteFile
{
	public static void main(String ar[])throws IOException
	{	
	File file=new File("delete.txt");
	file.createNewFile();
	if(file.delete())
		System.out.println(file.getName()+"File deleted successfully");
	else 
		System.out.println(file.getName()+"not deleted");
	}
}