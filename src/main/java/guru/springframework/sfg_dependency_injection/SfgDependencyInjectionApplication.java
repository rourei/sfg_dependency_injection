package guru.springframework.sfg_dependency_injection;

import guru.springframework.sfg_dependency_injection.controllers.ConstructorInjectedController;
import guru.springframework.sfg_dependency_injection.controllers.MyController;
import guru.springframework.sfg_dependency_injection.controllers.PropertyInjectedController;
import guru.springframework.sfg_dependency_injection.controllers.SetterInjectedController;
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

		System.out.println("----------- Primary");
		System.out.println(myController.sayHello()); // prints the message from the Primary Bean

		// Make Spring manage the dependency injection for the property injected controller
		System.out.println("----------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		// Make Spring manage the dependency injection for the setter injected controller
		System.out.println("----------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		// Make Spring manage the dependency injection for the constructor injected controller
		System.out.println("----------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
