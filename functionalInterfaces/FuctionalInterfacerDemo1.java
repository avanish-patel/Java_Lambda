/*
*  Created by
*  @Author Avanish Patel
*/

package functionalInterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class FuctionalInterfacerDemo1 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(

				new Person("Avanish", "Patel", 24), 
				new Person("Sam", "Steve", 35), 
				new Person("Devid", "Backham", 35),
				new Person("Raj", "Patel", 21), 
				new Person("Chirag", "Lee", 23)

		);
		
		// sort the people according to their first name
		
		Collections.sort(people, (p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
		
		// print the sorted people
		
		printConditionaly(people, p -> true);
		
		// print the people whose last name starts with P
		
		System.out.println("Prints the person whose last name starts with P");
		printConditionaly(people, p -> p.getLastName().startsWith("P"));
		

	}
	
	
	// method to print people conditional, we are using built in interface Predicate and its method that takes object as input and returns boolean
	
	private static void printConditionaly(List<Person> people, Predicate<Person> predicate) {
		
		for(Person p: people) {
			
			if (predicate.test(p)) {
				
				System.out.println(p);
			}
		}
		
	}

}
