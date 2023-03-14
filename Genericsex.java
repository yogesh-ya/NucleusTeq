//Solving the problem of ClassCastException
import java.util.*;
class Genericsex
{
	public static void main(String ar[])
	{	
	ArrayList<Integer> al=new ArrayList<>();
	al.add(120);
	al.add(20);
	al.add(30);
	al.add("40");//compile time error
	al.add(null);
	Integer i=(Integer)al.get(3);
	System.out.println(i);
	}
}