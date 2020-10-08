package com.claro.spring.UR4.test.springin5steps;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {
	
	//BubbleSortAlgorithm não possui uma dependência. Portanto não irá possuir @Autowired.
	
	public int [] sort(int[] numbers) {
		
		// Logic for Bubble Sorting (loosely coupled with binary search)
		
		return numbers;
	}

}
