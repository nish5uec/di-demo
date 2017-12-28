package com.sharma;

import com.sharma.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoDiApplication.class, args);
		MyController controller = (MyController) context.getBean("myController");
		controller.hello();
	}
}
