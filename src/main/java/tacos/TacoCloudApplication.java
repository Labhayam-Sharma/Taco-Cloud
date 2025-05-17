package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TacoCloudApplication {
	

	public static void main(String[] args) {
		
//		run();
//		runController();
		SpringApplication.run(TacoCloudApplication.class, args);

		
	}
	
/*	private static void runController(){
		Class<?> cas = LandingPage.class;
		GetMapping annotation = null;
		try {
			annotation = cas.getMethod("home", null).getAnnotation(GetMapping.class);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(annotation);
		
	}

	public static void run() {
		Class<?> c = TacoCloudApplication.class; // First, create an object of class Class of the java.lang package
		SpringBootApplication cls = c.getAnnotation(SpringBootApplication.class);
		System.out.println("Well Hello!" + cls.toString());

	}
	*/
	
}