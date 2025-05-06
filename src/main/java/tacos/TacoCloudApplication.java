package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TacoCloudApplication {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		
		Class<?> c = TacoCloudApplication.class; // First, create an object of class Class of the java.lang package
		SpringBootApplication cls = c.getAnnotation(SpringBootApplication.class);
		System.out.println("Well Hello!" + cls.toString());
		
		
		SpringApplication.run(TacoCloudApplication.class, args);
	}
	
}