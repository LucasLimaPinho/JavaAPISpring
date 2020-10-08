package com.claro.spring.UR4.test.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


//@SpringBootApplication realiza um scan de todo o package.

@SpringBootApplication
public class SpringIn5StepsApplication {
	
	//What are the beans? R: @Component
	//What are the dependencies of a bean? R: @Autowired
	//Where to search for beans? R: @SpringBootApplication
	
	
	public static void main(String[] args) {
		
		//Spring Boot fará a linha abaixo para nós após a utilização de Anotations.
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		// Application Context 
		
		ApplicationContext applicationContext =  SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		int result = binarySearch.binarySearch(new int[] {124,6}, 3);
						
		System.out.println(result);
		
		System.out.println(binarySearch);
	}

}
