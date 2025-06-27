package az.developia.FirstSpringProject.beans;

import org.springframework.stereotype.Component;

@Component
public class Keyboard {
public	String type;
public	int count;
	public Keyboard() {
		type="Mechanic";
		count =64;
	}

}
