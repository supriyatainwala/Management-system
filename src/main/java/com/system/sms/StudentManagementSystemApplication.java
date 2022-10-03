package com.system.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.system.sms.entity.Student;
import com.system.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
@Autowired
public StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student student1=new Student("Ramesh", "Fadatare", "rameah@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2=new Student("Sanjay", "Jhadav","samjay@gmail.com");
//		studentRepository.save(student2);
		
	}

}
