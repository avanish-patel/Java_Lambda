/*
*  Created by
*  @Author Avanish Patel
*/

package functionalInterfaces;

import java.util.Arrays;
import java.util.List;

public class CollectionIteration {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(

				new Person("Avanish", "Patel", 24), new Person("Sam", "Steve", 35), new Person("Devid", "Backham", 35),
				new Person("Raj", "Patel", 21), new Person("Chirag", "Andrew", 23)

		);
		
		// using for loop
		
		System.out.println("Iterating using for loop.");
		
		for(int i =0; i< people.size(); i++) {
			
			System.out.println(people.get(i));
		}
		
		// using for in loop
		
		System.out.println("Iterating using for-in loop.");
		
		for(Person p: people) {
			
			System.out.println(p);
		}
		
		// using for each loop and passing consumer to it
		System.out.println("Iterating using forEach loop");
		people.forEach((p) -> System.out.println(p));
		
		// another way of forEach
		
		System.out.println("another forEach");
		
		people.forEach(System.out::println);
	}

}
