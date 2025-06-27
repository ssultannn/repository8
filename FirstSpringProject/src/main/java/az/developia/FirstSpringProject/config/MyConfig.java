package az.developia.FirstSpringProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import az.developia.FirstSpringProject.beans.Computer;
import az.developia.FirstSpringProject.beans.Ram;

@Configuration
//С помощью Java Класса
public class MyConfig {

//	@Bean
//	public Computer myComputer() {
//		Computer computer = new Computer();
//		computer.model = "hp";
//		return computer;
//	}
@Bean
public Ram myRam() {
	Ram ram=new Ram();
	ram.type="Amd";
	ram.size=64;
	return ram;
}
}

//bean myComputer
