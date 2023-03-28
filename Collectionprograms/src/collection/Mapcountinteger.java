/*1. WAP to count frequency of given list of digit and alphabet in string .

i/p {1,1,2,2} --> 1= 2, 2=2

believe in yourself --> e=4 , b=1 etc*/
package collection;

import java.util.HashMap;
import java.util.Map;

public class Mapcountinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map=new HashMap<>();
		int x[]= {1,1,2,2,2,2};
		
		for(int i:x)
		{
			if(map.containsKey(i))
			{
				map.put(i,map.get(i)+1);
			}
			else
			{
				map.put(i,1);
			}
		}
		for(Map.Entry<Integer,Integer> e:map.entrySet())
		{
			System.out.println(e.getKey()+" -"+e.getValue());
		}
	}
	}

