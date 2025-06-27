package az.developia.FirstSpringProject.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//С помощью Аннотаций
@Component()
@Primary
public class Computer {
	public String model;

	@Autowired
	@Qualifier("myRam")
	public Ram ram;
	
	@Autowired
	public Keyboard keyboard;

	public Computer() {
		model = "Lenovo";
	}

}

//bean computer
