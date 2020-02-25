package pe.edu.unsch.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.edu.unsch.model.Libro;

public class MainApp {
	public static void main(String [] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
		Libro libro=(Libro)applicationContext.getBean("libro");
		//libro.imprimirLibro();
		System.out.println(libro);
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}
