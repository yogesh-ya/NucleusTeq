/*1. WAP(write a program) to store only unique elements in arraylist .

e.g list - [1,2,1,2,1,2,1,2,1]

o/p list- [1,2]*/

package collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {1,2,1,2,1,2,1,2,1};
		ArrayList<Integer> al=new ArrayList<>();
		for(int i:x)
		{
			if(al.contains(i))
			{
				
			}
			else
			{
				al.add(i);
			}
			
		}
		System.out.println(al);
	}

}
