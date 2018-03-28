/*
*  Created by
*  @Author Avanish Patel
*/

// Generic Lambda function

interface MyGeneric<T>{
	
	T compute(T t);
}

public class LambdaTest5 {
	
	
	public static void main(String[] args) {
	
	// lambda expression that return reverse of string
	MyGeneric<String> reverseString = (str) -> {
		
		String result = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			
			result += str.charAt(i);
		}
		
		return result;
	};
	
	// lambda expression that return factorial of number
	MyGeneric<Integer> factorial = (n) ->{
		
		int fact = 1;
		
		for (int i = 1; i <= n; i++) {
			
			fact = fact * i;
		}
		
		return fact;
		
	};
	
	
	System.out.println(reverseString.compute("Avanish"));
	System.out.println(factorial.compute(5));
	
	}

}
