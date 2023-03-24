package com.employee.empop;
import com.employee.emp.Employee;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
public class Employeepearation {
	
	//count for counting no. of employees
	static int count;
	//creating employee 
	static Employee employee1=new Employee();
	static Scanner sc=new Scanner(System.in);
	static int ch;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method st1ub	
		
	
			while(true)
			{
				System.out.println("=============Employee Management Application(\"=============");
				System.out.println("Enter 1 to add new Employee");
				System.out.println("Enter 2 to delete Employee");
				System.out.println("Enter 3 to edit Employee");
				System.out.println("Enter 4 to print all Emplopyee details");
				System.out.println("Enter 5 to Search Emplopyee");
				System.out.println("Enter 6 to exit");
				
				System.out.println("Entered =>");
				
				ch=sc.nextInt();
				switch(ch)
				{
				case 1:
				{
					Employeepearation.addEmployee();
					System.out.println("new Employee added successfully");
					break;
				}
				
				case 2:
				{
					
					Employeepearation.addToList();
					break;
				}
				case 3:
				{
					Employeepearation.addToList();
					break;
				}
												
				case 4:
				{
					Employeepearation.showAll();
					System.out.println("\n");
				break;
				}
				case 5:
				{
					Employeepearation.addToList();
					System.out.println("\n");
				break;
				}
				case 6:
				{
					System.out.println("you are exiting from the application");
					System.exit(0);
				}
				
				}
				
			}
	}
			//adding new employee
	        public static  void addEmployee() throws IOException
			{
				BufferedWriter writer=new BufferedWriter(new FileWriter("F:\\NucleusTeq\\employeedata.txt",true));
				System.out.println("Enter id");
				employee1.setId(sc.nextInt());
				sc.nextLine();
				
				System.out.println("Enter First & Last Name");
				employee1.setName(sc.nextLine());
				
				System.out.println("Enter Email");
				employee1.setEmail(sc.nextLine());
				
				System.out.println("Enter Contact");
				employee1.setContact(sc.nextLong());
				
				System.out.println("Enter Salary");
				employee1.setSalary(sc.nextInt());
				sc.nextLine();
				
				System.out.println("Enter Address");
				employee1.setAddress(sc.nextLine());
				writer.write(employee1.toString());
				writer.newLine();
				writer.close();
			}
	        
	        //printing all employee data
	        public static void showAll() throws IOException
	        {
	        	BufferedReader reader=new BufferedReader(new FileReader("F:\\NucleusTeq\\employeedata.txt"));
	        	String line=reader.readLine();
	        	if(line==null)
	        	{
	        		System.out.println("no employee is present");
	        	}
	        	count=0;
	        	while(line!=null)
	        	{
	        		count++;
	        		System.out.println("Employee: "+line);
	        		line=reader.readLine();
	        	}
	        	System.out.println("Total Employe= "+count);
	        	reader.close();
	        }
	        
	        
	        //search for employee by id
	       public static void addToList() throws IOException
	        {
	    	   ArrayList<String> al=new ArrayList<>();
	    	BufferedReader reader=new BufferedReader(new FileReader("F:\\NucleusTeq\\employeedata.txt"));
	        System.out.println("Enter id to search employee");
			String userid=sc.next();
			String line=reader.readLine();
			
			if(line==null)
        	{
        		System.out.println("no employee is present");
        	}
			while(line!=null)
			{
				
				al.add(line);
				line=reader.readLine();
			}
			if(ch==2)
			{
				Employeepearation.remove(al,userid);
			}
			else if(ch==3)
			{
				Employeepearation.edit(al,userid);
			}
			else if(ch==5)
			{
				Employeepearation.search(al,userid);
			}
			reader.close();
			}
	       
	       //remove the employee
	       public static void remove(ArrayList<String> al,String userid) throws IOException
	       {
	    	 int c=0;
	    	 for(int i=0;i<al.size();i++)
	    	 {
	    		 String s1=al.get(i);
	    		 if(s1.contains(userid))
	    			 {c++;
	    			 al.remove(i);
	    			count--;
	    			 System.out.println("Employee removed");
	    			 }
	    	 }
	    	 if(c==0)
	    	 {
	    	 System.out.println("Employee with id= "+userid+" not available");
	    	 return;
	    	 }
	    	 
	    	 if(c!=0)
	    	 {
	    	 BufferedWriter writer=new BufferedWriter(new FileWriter("F:\\NucleusTeq\\employeedata.txt"));
	    	 for(String employee:al)
	    	 {
	    		 writer.write(employee);
	    		 writer.newLine();
	    	 }
	    	 writer.close();
	       }
	    	 }
	       
	       //edit details of employee
	       public static void edit(ArrayList<String> al,String userid) throws IOException
	       {
	    	   int c=0;
	    	   int i;
		    	 for(i=0;i<al.size();i++)
		    	 {
		    		 String s1=al.get(i);
		    		 if(s1.contains(userid))
		    			{c++;
		    			boolean b=true;
		    			 while(b)
		    			 {
		    			 System.out.println("Enter 1 to change id");
		    			 System.out.println("Enter 2 to change Name");
		    			 System.out.println("Enter 3 to change Email");
		    			 System.out.println("Enter 4 to change Contact");
		    			 System.out.println("Enter 5 to change Salary");
		    			 System.out.println("Enter 6 to change Address");
		    			 System.out.println("Enter 7 to exit");
		    			 
		    			 System.out.println("Enter =");
		    			 String employee[]=al.get(i).split(" ");
		    			 ch=sc.nextInt();
			    		  switch(ch)
			    		  { 
			    		  case 1:
			    		  {
			    			  System.out.println("Enter new Id");
			    			  employee[1]=""+sc.nextInt();
			    			  
			    			  break;
			    		  }
			    		  case 2:
			    		  {
			    			  sc.nextLine();
			    			  System.out.println("Enter First Name");
			    			  employee[3]=sc.next();
			    			  System.out.println("Enter Last Name");
			    			  employee[4]=sc.next();
			    			  break;
			    		  }
			    		  case 3:
			    		  {
			    			  sc.nextLine();
			    			  System.out.println("Enter new Email");
			    			  employee[6]=sc.nextLine();
			    			  break;
			    		  }
			    		  case 4:
			    		  {
			    			  System.out.println("Enter new Contact");
			    			  employee[8]=""+sc.nextLong();
			    			  break;
			    		  }
			    		  case 5:
			    		  {
			    			  System.out.println("Enter Salary");
			    			  employee[10]=""+sc.nextInt();
			    			  
			    			  break;
			    		  }
			    		  case 6:
			    		  {
			    			  sc.nextLine();
			    			  System.out.println("Enter new Address");
			    			  employee[12]=sc.nextLine();
			    			  break;
			    		  }
			    		  case 7:
			    		  {
			    			  b=false;
			    			  break;
			    		  }
			    		  default:
			    			  System.out.println("Invalid choice");
			    			  break;
			    		  }
			    		 
			    		  al.set(i, String.join(" ", employee));
		    			}
		    			}
		    	 }
		    	 if(c==0)
		    	 {
		    	 System.out.println("Employee with id= "+userid+" not available");
		    	 return;}
		    	 
		    	 if(c!=0)
		    	 {
		    	 BufferedWriter writer=new BufferedWriter(new FileWriter("F:\\NucleusTeq\\employeedata.txt"));
		    	 for(String employee:al)
		    	 {
		    		 writer.write(employee);
		    		 writer.newLine();
		    	 }
		    	 writer.close();
		       }
	       }
	       
	       //Search employee using id
	       public static void search(ArrayList<String> al,String userid)
	       {
	    	   int c=0;
		    	 for(int i=0;i<al.size();i++)
		    	 {
		    		 String s1=al.get(i);
		    		 if(s1.contains(userid))
		    			 {c++;
		    			 System.out.println(al.get(i));
		    			 }
		    	 }
		    	 if(c==0)
		    	 {
		    	 System.out.println("Employee with id= "+userid+" not available");
		    	 return;
		    	 } 
	       }
		
	       
	        
	

}
