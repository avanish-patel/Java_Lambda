/*
*  Created by
*  @Author Avanish Patel
*/

package funcitonalInterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

// Functional interface has only one abstract method

public class FuncitonalInterfaceDemo2 {
	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(

				new Person("Avanish", "Patel", 24), 
				new Person("Sam", "Steve", 35), 
				new Person("Devid", "Backham", 35),
				new Person("Raj", "Patel", 21), 
				new Person("Chirag", "Lee", 23)

		);
		
		// sort people according to their last name
		
		Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		// print all person
		
		performConditionaly(people, p -> true, p -> System.out.println(p));
		
		// print first name of person which is starts with a
		
		performConditionaly(people, p -> p.getFirstName().startsWith("A"), p -> System.out.println(p.getFirstName()));
		
		
		
		
	}
	
	
	private static void performConditionaly(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer) {
		
		for(Person p : persons) {
			
			if (predicate.test(p)) {
				
				consumer.accept(p);
			}
		}
	}
	
}
