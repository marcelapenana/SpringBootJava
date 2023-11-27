package com.universidadbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class UniversidadBackendApplication {


	public static void main(String[] args) {
		String[] beanDefinitionNames = SpringApplication.run(UniversidadBackendApplication.class, args).getBeanDefinitionNames();
		/*for(String str : beanDefinitionNames){
			System.out.println(str);
		}*/
	}

}
