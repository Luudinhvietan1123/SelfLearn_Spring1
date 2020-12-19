package com.example.SelfLearn_Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Collections;

@SpringBootApplication
public class SelfLearnSpringApplication {

	public static void main(String[] args) {
		System.out.println(">Truoc khi IoC duoc khoi tao");
		ApplicationContext context = SpringApplication.run(SelfLearnSpringApplication.class);
		System.out.println(">Sau khi IoC duoc khoi tao");
		Girl girl = context.getBean(Girl.class);
		System.out.println(">Truoc khi IoC container destroy Girl");
		((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(girl);
		System.out.println(">Sau khi IoC Destroy Girl");
	}

}
