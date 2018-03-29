/*
*  Created by
*  @Author Avanish Patel
*/
interface StringLenghthLamnda{
	int getLength(String s);
}

public class TypeInference {
	
	public static void printLambda(StringLenghthLamnda l) {
		
		System.out.println(l.getLength("Hello World"));
	}
	
	public static void main(String[] args) {
		
		printLambda(s -> s.length());
	}

}
