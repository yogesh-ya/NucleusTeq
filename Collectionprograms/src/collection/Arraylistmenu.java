/*
 2. create a menu program with following options .
1. add
2.remove
3.display element
4.exit
program should run until user choose 4th option.
 */
package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistmenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<------------Arraylist Menu Driven------------>");
		ArrayList<Integer> al=new ArrayList<>();
		boolean flag=true;
		while(flag)
		{
			System.out.println("Enter 1 to add");
			System.out.println("Enter 2 to remove elements");
			System.out.println("Enter 3 to display elements");
			System.out.println("Enter 4 to exit");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter element");
				al.add(sc.nextInt());
				break;
			}
			case 2:
			{
				System.out.println("Enter which element to remove");
				Integer i=sc.nextInt();
				boolean rm=al.remove(i);
				if(rm) System.out.println("element removed");
				else System.out.println("element not present");
				break;
			}
			case 3:
			{
				System.out.println(al);
				break;
			}
			case 4:
			{
				flag=false;
				System.out.println("exiting...");
				break;
			}
			}			
		}
	}

}
