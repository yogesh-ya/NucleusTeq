/*Write a class Student having following properties and methods:

Property: rollNumber, name, course, marks1, marks2, marks3

Methods: calculateTotal(), calculateAverage(), calculateGrade()

Create getter and setter methods.

Create class StudentTest with main method for calling Student class.

StudentTest should contain atleast 5 student objects with different grades.

Implement toString method to display details of each student.

Also display grades of each student.

Store the student file in a package student;*/
package student;
public class Student
{
	private int rollNumber;
	private String name;
	private String course;
	private float marks1;
	private float marks2;
	private float marks3;
	
	public void setRollNumber(int rollNumber)
	{
		this.rollNumber=rollNumber;
	}
	public int getRollNumber()
	{
		return rollNumber;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setCourse(String course)
	{
		this.course=course;
	}
	public String getCourse()
	{
		return course;
	}
	public void setMarks1(float marks1)
	{
		this.marks1=marks1;
	}
	public float getMarks1()
	{
		return marks1;
	}
	public void setMarks2(float marks2)
	{
		this.marks2=marks2;
	}
	public float getMarks2()
	{
		return marks2;
	}
	public void setMarks3(float marks3)
	{
		this.marks3=marks3;
	}
	public float getMarks3()
	{
		return marks3;
	}
	public float calculateTotal()
	{
		return marks1+marks2+marks3;
	}
	public float calculateAverage()
	{
		return (marks1+marks2+marks3)/3;
	}
	public String calculateGrade()
	{
		int average=(int)calculateAverage();
		String grade=average>=90?"A+":average>=80&&average<90?"A":average>=70&&average<80?"B":average>=60&&average<70?"C":average>=50&&average<60?"D":"F";
		return grade;
	}
	@Override
	public String toString()
	{
		return "Student [ rollNumber :"+rollNumber+", name :"+name+", course : "+course+", marks1 :"+marks1+", marks2 :"+marks2+", marks3 :"+marks3+" ]";
	}
}