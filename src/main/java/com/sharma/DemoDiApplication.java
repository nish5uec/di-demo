package com.sharma;

import com.sharma.controllers.ConstructorInjectedController;
import com.sharma.controllers.MyController;
import com.sharma.controllers.PropertyInjectedController;
import com.sharma.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoDiApplication.class, args);
		MyController controller = (MyController) context.getBean("myController");
		controller.hello();

		System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(context.getBean(SetterInjectedController.class).sayHello());
		System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
	}
}
