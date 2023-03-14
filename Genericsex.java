//type casting problem
import java.util.*;
class Genericsex
{
	public static void main(String ar[])
	{	
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(null);
	Integer i=(Integer)al.get(0);
	System.out.println(i);
	}
}