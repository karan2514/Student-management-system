package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student stud1 = new Student("Micheal","Scott","MichealScott@gmail.com");
//		studentRepository.save(stud1);
//		
//		Student stud2 = new Student("Dwight","Shrut","DwightShrut@gmail.com");
//		studentRepository.save(stud2);
//		
//		Student stud3 = new Student("Kevin","Rodrigues","KevinRodrigues@gmail.com");
//		studentRepository.save(stud3);
	}

}
