/*1. reverse First k element of Queue
i/p :
5 (no. of inputs)=
1,2,3,4,5
4( no. of elements to reverse)
o/p :
4,3,2,1,5*/

package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queueprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedList<Integer> queue=new LinkedList<>();
  int k=4;
  queue.add(10);
  queue.add(20);
  queue.add(30);
  queue.add(40);
  queue.add(50);
  queue.add(60);
  queue.add(70);
  queue.add(80);
  queue.add(90);
  queue.add(100);
  
  System.out.println(queue);
  queue=reverse(queue,k);
  System.out.println(queue);
	}
	static LinkedList<Integer> reverse(LinkedList<Integer> queue, int k)
	{
		reverse2(queue,k);
		int size=queue.size()-k;
		while(size>0)
		{
			int value=queue.poll();
			queue.add(value);
			size--;
		}
		return queue;
		
	}
	static void reverse2(LinkedList<Integer> queue, int k) {

		if(k==0)
			return;
		int e=queue.poll();
		reverse2(queue,k-1);
		queue.add(e);		
	}
}
