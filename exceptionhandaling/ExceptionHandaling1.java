/*
*  Created by
*  @Author Avanish Patel
*/

package exceptionhandaling;

import java.util.function.BiConsumer;

public class ExceptionHandaling1 {

	public static void main(String[] args) {

		int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int key = 0;

		Process(numbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));

	}



	// method that takes and integer array and do something with key and print the
	// value

	private static void Process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {

		for (int i : numbers) {

			consumer.accept(i, key);
		}
	}
	
	// method that provides wrap over the lambda function -> take lambda -> returns lambda
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		
		return (v,k) -> {
			
			try {
				consumer.accept(v, k);
			}catch (ArithmeticException e) {
				
				System.out.println("Arithmetic exception occurs...");
			}
		};
	}

}
