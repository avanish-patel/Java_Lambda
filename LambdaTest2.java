import java.util.jar.Attributes.Name;

/*
*  Created by
*  @Author Avanish Patel
*/

// interface to provide type signature to the lambda expression
interface MyGreeting{
	
	void processName(String s);
}

// class
public class LambdaTest2 {
	
	public static void main(String[] args) {
		
		// two lambda expressions that take naem as input and print greeting to the console
		MyGreeting morningGreeting = (name)-> System.out.println("Good Morning "+ name+ " !");
		MyGreeting eveningGreeting = (name) -> System.out.println("Good Evening "+ name + " !");
		
		
		morningGreeting.processName("Avanish");
		eveningGreeting.processName("Raj");
		
	}

}
