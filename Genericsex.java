//Solving the problem of type casting using genrics
import java.util.*;
class Genericsex
{
	public static void main(String ar[])
	{	
	ArrayList<Integer> al=new ArrayList<>();
	al.add(120);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(null);
	Integer i=al.get(0);
	System.out.println(i);
	}
}