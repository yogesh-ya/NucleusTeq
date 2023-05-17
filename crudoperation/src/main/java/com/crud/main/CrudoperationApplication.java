package com.crud.main;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.crud.main.dao.StudentRepository;
import com.crud.main.model.Student;

@SpringBootApplication
public class CrudoperationApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(CrudoperationApplication.class, args);
		StudentRepository studentRepository =context.getBean(StudentRepository.class);
		//1. Insert
		//1.1 Insert single Student in database
		//Student student1=new Student();
		//student1.setName("abhi");
		//student1.setCity("Indore");
		
	//Student student=studentRepository.save(student1);
	//System.out.println(student);
		
		//1.2 Insert multiple student at once
//		Student student1 =new Student();
//		student1.setName("Sachin");
//		student1.setCity("Bhopal");
//		
//		Student student2 =new Student();
//		student2.setName("Rachin");
//		student2.setCity("Singapore");
		
		//all students added in the list
//		List<Student> students=List.of(student1,student2);
		
		//all students saved
//		Iterable<Student> result=studentRepository.saveAll(students);
		
//		result.forEach(user->System.out.println(user));
//	----------------------------
		
		//2.Get all student 
//		Iterable<Student> allStudent=studentRepository.findAll();
//		allStudent.forEach(user->System.out.println(user));
		
		//---------------
		
		//3. Update
//		Optional<Student> optional=studentRepository.findById(2);
//		Student student111=optional.get();
//		System.out.println(student111);
//		student111.setName("Rahul kumar");
//		System.out.println(student111);
//		System.out.println("Student info updated");
		//-----------
		
		//4.1 Delete student by Id
//		studentRepository.deleteById(2);
		
		//4.2 Delete all students
		Iterable<Student> allStudent=studentRepository.findAll();
		studentRepository.deleteAll(allStudent);
		System.out.println("All students deleted");
	}

}
