/*
*  Created by
*  @Author Avanish Patel
*/

public class Greeter {
	
	
	public void greet(Greeting greeting) {
		
		greeting.perform();
	}
	
	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		
		// classical way of instantiate implementation of Greeting into HelloWorldGreeting and pass this instance to method greet()
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		
		greeter.greet(helloWorldGreeting);
		
		// using anonymous class to implement method inside instance of interface
		Greeting anonymousGreeting = new Greeting() {
			
			@Override
			public void perform() {

				System.out.println("Anonymous Greeting");
			}
		};
		
		greeter.greet(anonymousGreeting);
		
		// using lambda expression
		
		Greeting lamndaGreeting = () -> System.out.println("Lambda Greeting.");
		
		// two ways to call lambda functions
		lamndaGreeting.perform();
		
		greeter.greet(lamndaGreeting);
	}

}


