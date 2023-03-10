package com.example.student.management.system;

import com.example.student.management.system.entity.Student;
import com.example.student.management.system.repository.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {


//		Student student1 = new Student("ramesh","kumar","ramesh@gmail.com");
//		studentRepository.save(student1);
//		Student student2 = new Student("vignesh","kumar","vignesh@gmail.com");
//		studentRepository.save(student2);
//		Student student3 = new Student("suresh","kumar","ramesh@gmail.com");
//		studentRepository.save(student3);

	}
}
