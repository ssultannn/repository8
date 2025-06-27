package az.developia.FirstSpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import az.developia.FirstSpringProject.beans.Computer;
import az.developia.FirstSpringProject.beans.Person;
import az.developia.FirstSpringProject.beans.Student;

@SpringBootApplication
public class FirstSpringProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstSpringProjectApplication.class, args);

//		for (String s : context.getBeanDefinitionNames()) {
//			System.out.println(s);
//		}
		
		

//
//		Student student=context.getBean(Student.class);
//		System.out.println(student.getName());	
		
//		
//		Computer computer=context.getBean(Computer.class);
//		System.out.println("computer Model " + computer.model);
//		System.out.println("ram type "+ computer.ram.type);
//		System.out.println( "ram size "+ computer.ram.size);
//		System.out.println( "keyboard type "+  computer.keyboard.type);
//		System.out.println("keyboard count "+ computer.keyboard.count);
		
		Person person=context.getBean(Person.class);
		person.name="emil";
		System.out.println(person.name);
		

		Person person2=context.getBean(Person.class);
		System.out.println(person2.name);

		
		Person person3=context.getBean(Person.class);
		System.out.println(person3.name);

	}

}
