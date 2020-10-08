package com.claro.spring.UR4.test.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//Se eu definir dois @Component para o @Autorwired SortAlgorithm teremos o seguinte erro em
// logging.level.com.springframework = debug


/* Parameter 0 of constructor in com.claro.spring.UR4.test.springin5steps.BinarySearchImpl required a single bean, but 2 were found:
- bubbleSortAlgorithm: defined in file [C:\Users\Semantix\spring-learning\spring-in-5-steps\target\classes\com\claro\spring\UR4\test\springin5steps\BubbleSortAlgorithm.class]
- quickSortAlgorithm: defined in file [C:\Users\Semantix\spring-learning\spring-in-5-steps\target\classes\com\claro\spring\UR4\test\springin5steps\QuickSortAlgorithm.class]
*/

// A forma de contornar isso é fazendo o add primary.
// Usando @Primary

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
	
	public int [] sort(int[] numbers) {
		
		// Logic for Quick Sorting (loosely coupled with binary search)
		
		return numbers;
	}

}
