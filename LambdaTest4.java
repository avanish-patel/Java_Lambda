/*
*  Created by
*  @Author Avanish Patel
*/

// Block of lambda function

@FunctionalInterface
interface OwnString{
	
	String myStringFunction(String s);
	
}

// class
public class LambdaTest4 {
	
	public static void main(String[] args) {
		
		// lambda function that return reverse of string
		OwnString reverseString = (String str) -> {
			
			String result ="";
			
			for(int i = str.length()-1; i >= 0; i--) {
				
				
				result += str.charAt(i);
			}
			
			return result;
			
		};
		
		
		System.out.println("Avanish == " + reverseString.myStringFunction("Avanish"));
		System.out.println(reverseString.myStringFunction("Reverse Lambda"));
		
		
	}
}
