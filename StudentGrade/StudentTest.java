import student.Student;
public class StudentTest
{
	public static void main(String ar[])
	{
		//Details of student 1
		Student s1=new Student();
		s1.setRollNumber(101);
		s1.setName("aaa");
		s1.setCourse("Computer Science");
		s1.setMarks1(90);
		s1.setMarks2(90);
		s1.setMarks3(90);
		Student s5=new Student();
		
		//Details of student 2
		Student s2=new Student();
		s2.setRollNumber(102);
		s2.setName("bbb");
		s2.setCourse("Information Technology");
		s2.setMarks1(80);
		s2.setMarks2(80);
		s2.setMarks3(80);
		
		//Details of student 3
		Student s3=new Student();
		s3.setRollNumber(103);
		s3.setName("ccc");
		s3.setCourse("Telecommunications");
		s3.setMarks1(70);
		s3.setMarks2(70);
		s3.setMarks3(70);
		
		//Details of student 4
		Student s4=new Student();
		s4.setRollNumber(104);
		s4.setName("ddd");
		s4.setCourse("Civil Engineering");
		s4.setMarks1(60);
		s4.setMarks2(60);
		s4.setMarks3(60);
		
		//Details of student 5
		s5.setRollNumber(105);
		s5.setName("eee");
		s5.setCourse("Mechanical Engineering");
		s5.setMarks1(40);
		s5.setMarks2(40);
		s5.setMarks3(40);
		
		System.out.println("Details of "+s1.getName());
		System.out.println(s1);
		System.out.println("Total marks of student is:"+s1.calculateTotal());
		System.out.println("Average marks of student is:"+s1.calculateAverage());
		System.out.println("Grade of student is:"+s1.calculateGrade());
		System.out.println("____________________________");
		
		System.out.println("Details of "+s2.getName());
		System.out.println(s2);
		System.out.println("Total marks of student is:"+s2.calculateTotal());
		System.out.println("Average marks of student is:"+s2.calculateAverage());
		System.out.println("Grade of student is:"+s2.calculateGrade());
		System.out.println("____________________________");
		
		System.out.println("Details of "+s3.getName());
		System.out.println(s3);
		System.out.println("Total marks of student is:"+s3.calculateTotal());
		System.out.println("Average marks of student is:"+s3.calculateAverage());
		System.out.println("Grade of student is:"+s3.calculateGrade());
		System.out.println("____________________________");
		
		System.out.println("Details of "+s4.getName());
		System.out.println(s4);
		System.out.println("Total marks of student is:"+s4.calculateTotal());
		System.out.println("Average marks of student is:"+s4.calculateAverage());
		System.out.println("Grade of student is:"+s4.calculateGrade());
		System.out.println("____________________________");
		
		System.out.println("Details of "+s5.getName());
		System.out.println(s5);
		System.out.println("Total marks of student is:"+s5.calculateTotal());
		System.out.println("Average marks of student is:"+s5.calculateAverage());
		System.out.println("Grade of student is:"+s5.calculateGrade());
	}
}