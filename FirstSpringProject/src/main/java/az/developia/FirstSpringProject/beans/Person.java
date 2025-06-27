package az.developia.FirstSpringProject.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {
	
@Value("${person.name}")	
public	String name;

	public Person() {
	//	name="umud";
		System.out.println("person created");
	}
}
