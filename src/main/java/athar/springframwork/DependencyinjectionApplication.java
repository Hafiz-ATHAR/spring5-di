package athar.springframwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import athar.springframwork.controllers.ConstructorInjectedController;
import athar.springframwork.controllers.PrimaryController;
import athar.springframwork.controllers.PropertyInjectedController;

@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(DependencyinjectionApplication.class, args);
	
	System.out.println(context.getBean(ConstructorInjectedController.class).getMovie());
	System.out.println(context.getBean(PropertyInjectedController.class).getMovie());
	System.out.println(context.getBean(PrimaryController.class).getMovie());
	}
}
