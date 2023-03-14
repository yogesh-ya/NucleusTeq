//throws FileNotFoundException check Exception using throws keyword
import java.io.PrintWriter;
import java.io.FileNotFoundException;
class ThrowsKeyword
{
	public static void main(String ar[])throws FileNotFoundException
	{
		PrintWriter pr=new PrintWriter("abccc.txt");
		pr.write("abccc file is overwrite something");
	   pr.close();
	}
}