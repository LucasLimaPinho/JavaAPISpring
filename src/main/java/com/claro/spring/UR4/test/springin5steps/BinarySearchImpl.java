package com.claro.spring.UR4.test.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class BinarySearchImpl {
	
	//Com @Autowired, estou falando que BinarySearchImpl depende de SortAlgorithm
	//SortAlgorithm com @Autowired é uma dependência de BinarySearchImpl
	
	//Constructor Injection right here.
	//Tirando de 'logging.level.com.springframework = debug", temos o seguinte:
	//"Autowiring by type from bean name 'binarySearchImpl' via constructor to bean named 'bubbleSortAlgorithm'"
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int [] numbers, int numberToSearch) {
		
				
		int [] sortedNumbers = sortAlgorithm.sort(numbers);
		
		System.out.println(sortAlgorithm);
		
		//Sorting an array
		//Search the array
		//Return the result
		
		return 3;
		
		
	}

}
