package com.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springframework.controllers.ConstructorInjectedController;
import com.springframework.controllers.PrimaryController;
import com.springframework.controllers.PropertyInjectedController;

@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(DependencyinjectionApplication.class, args);
	
	System.out.println(context.getBean(ConstructorInjectedController.class).getMovie());
	System.out.println(context.getBean(PropertyInjectedController.class).getMovie());
	System.out.println(context.getBean(PrimaryController.class).getMovie());
	}
}
