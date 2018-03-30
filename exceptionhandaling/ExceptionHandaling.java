/*
*  Created by
*  @Author Avanish Patel
*/

package exceptionhandaling;

import java.util.function.BiConsumer;

public class ExceptionHandaling {
	
	public static void main(String[] args) {
		
		int numbers[] = {1,2,3,4,5,6};
		int key = 2;
		
		process(numbers, key,(v,k)-> System.out.println(v / k));
		
		key =0;
		
		process(numbers, key, (v,k) -> {
			// Handling the exception divided by zero
			try {
				System.out.println(v / k);

			}catch(ArithmeticException ae) {
				
				System.out.println("Arithmetic exception occurs...");
			}
				
	
	
	});
		
		
		
		
		
		
	}

	private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		
		for(Integer i: numbers) {
			
		consumer.accept(i, key);
		
		}
		
		
	}

}
