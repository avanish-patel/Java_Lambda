/*
*  Created by
*  @Author Avanish Patel
*/

public class RunnableExample {
	
	public static void main(String[] args) {
		
		// implementation of runnable using anonymous inner class
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("From runnable interface anonymous class");
				
			}
		});
		
		myThread.run();
		
		// using lambda function to run the thread
		
		Thread myLambdaThread = new Thread(() -> System.out.println("From Runnable lambda function."));
		
		myLambdaThread.run();
		
		
		
		
		
		
		
		
	}

}
