package az.developia.FirstSpringProject.beans;

import org.springframework.stereotype.Component;

@Component
public class Ram {
public	String type;
public	int size;

	public Ram() {
		type = "ddr4";
		size = 32;
	}

}
