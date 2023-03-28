//believe in yourself --> e=4 , b=1 etc

package collection;

import java.util.HashMap;
import java.util.Map;

public class Mapcountchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="believe in yourself";
		char x[]=s.toCharArray();
		HashMap<Character,Integer> map=new HashMap<>();
		for(Character key:x)
		{
			if(map.containsKey(key))
			{
				map.put(key, map.get(key)+1);
			}
			else
			{
				map.put(key, 1);
			}
				}
		for(Map.Entry<Character,Integer> e:map.entrySet())
		{
			System.out.println(e.getKey()+" - "+e.getValue());
		}
			System.out.println(map);

	}

}
