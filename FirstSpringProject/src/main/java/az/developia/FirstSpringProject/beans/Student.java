package az.developia.FirstSpringProject.beans;

import org.springframework.stereotype.Component;
@Component
public class Student {

	String name;
	int age;

	public Student() {
		name = "Emil";
	}

	public String getName()
	{
		return name;
	}
}
//Student stu=new Student();