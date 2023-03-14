import java.io.Serializable;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
class Emplyoee implements Serializable
{
	private int id;
	String company;
	private String name;
	private float salary;
	private String position;
	private String dob;
	Emplyoee(int id,String name,String company,float salary,String position,String dob)
	{
		this.id=id;
		this.name=name;
		this.company=company;
		this.salary=salary;
		this.position=position;
		this.dob=dob;
	}
	public String toString()
	{
		return "id= "+id+" name= "+name+" Company = "+company+" Salary= "+salary+" position= "+position+" dob = "+dob;       
	}
	
}
class Emplyoeemanagement
{
	public static void main(String ar[])throws IOException 
	{
	Emplyoee ram=new Emplyoee(1,"Yogesh Kanare","NucleusTeq",40000.77f,"Software Engineer-0","22-06-2000");
	Emplyoee sita=new Emplyoee(2,"sita","NucleusTeq",50000.77f,"Software Engineer-1","22-06-2002");
	Emplyoee gita=new Emplyoee(3,"gita","NucleusTeq",400080.77f,"Software Engineer-2","22-06-2004");
	FileOutputStream fi=new FileOutputStream("employeemanagemt.txt");
	ObjectOutputStream os=new ObjectOutputStream(fi);
	os.writeObject(ram);
	os.writeObject(sita);
	os.writeObject(gita);
	os.close();
	fi.close();
	}
}