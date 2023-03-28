/*WAP to store only unique elements of array.

i/p int[] arr = {1,2,3,1,2,3,3,3,3}

o/p set= (1,2,3)*/

package collection;

import java.util.HashSet;

public class Setprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,1,2,3,3,3,3};
		HashSet<Integer> hs=new HashSet<>();
		for(int i:arr)
		{
			hs.add(i);
		}
		System.out.println(hs);
	}

}
