/*
*  Created by
*  @Author Avanish Patel
*/

// the interface that provide signature for lambda expression type
@FunctionalInterface
interface NumericTest{
	
	boolean computeTest(int n);
}


// class with main method
public class LambdaTest1 {
	
	public static void main(String[] args) {
		
		// lambda expression that compute the numbers is even if is return true
		NumericTest isEven = (n) -> (n % 2) == 0;
		
		// lambda expression that returns true if number is negative
		NumericTest isNegetive = (n) -> (n < 0);
		
		System.out.println(isEven.computeTest(5));
		System.out.println(isEven.computeTest(6));
		
		System.out.println(isNegetive.computeTest(4));
		System.out.println(isNegetive.computeTest(-3));
		
		
	}

}



