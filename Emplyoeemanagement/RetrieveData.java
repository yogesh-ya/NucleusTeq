import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
class RetrieveData
{
	public static void main(String ar[])throws IOException
	{
		FileInputStream fi=new FileInputStream("employeemanagemt.txt");
		ObjectInputStream os=new ObjectInputStream(fi);
		ArrayList al=new ArrayList();
		try
		{
		int i=0;
		while(true)
		{
		al.add((Emplyoee)os.readObject());
		System.out.println(al.get(i));
		i++;
		}
		}
		catch(Exception e1)
		{
			fi.close();
			os.close();
		}
		Emplyoee ram=(Emplyoee)al.get(0);
		ram.company="tcs";
		System.out.println(ram);
	}
}