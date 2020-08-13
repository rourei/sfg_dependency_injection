package guru.springframework.sfg_dependency_injection;

import guru.springframework.sfg_dependency_injection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDependencyInjectionApplication {

	public static void main(String[] args) {
		// run methods returns application context -> can be saved for later usage
		ApplicationContext ctx = SpringApplication.run(SfgDependencyInjectionApplication.class, args);

		// Bean name is usually the class name but beginning with lower case
		MyController myController = (MyController) ctx.getBean("myController");
		// The object is being created by the framework and can be retrieved from the context

		// Save the returned greeting and print it to the console
		String  greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
