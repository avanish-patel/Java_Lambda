/*
*  Created by
*  @Author Avanish Patel
*/

interface MyString{
	
	int length(String s);
}
public class LambdaTest3 {

	public static void main(String[] args) {
		
		// lambda function that returns the length of string
		MyString getLength = (String s) -> s.length();
		
		// calling lambda function
		System.out.println(getLength.length("Avanish"));
		System.out.println(getLength.length("Raj"));
		
		
		
	}
}
