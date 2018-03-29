/*
*  Created by
*  @Author Avanish Patel
*/

package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1SolutionJava7 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				
					new Person("Avanish", "Patel", 24),
					new Person("Sam", "Steve", 35),
					new Person("Devid", "Backham", 35),
					new Person("Raj", "Patel",21),
					new Person("Chirag", "Andrew", 23)
				
					);
		
		// sort the elements according to lastname
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getLname().compareTo(o2.getLname());
			}
		});
		
		// print the people collection
		System.out.println("Print all the persons: ");
		printAll(people);
		
		// print the people whose lastname starts with p
		System.out.println("Print the person whose last name starts with P");
		printLastNameWithP(people);
		
		// method that takes condition as parameter such that we can pass an action as input
		
		System.out.println("Print the person whose last name starts with P Conditionly(By passing action):");
		printConditionaly(people, new Condition() {

			@Override
			public boolean check(Person p) {
				return p.getLname().startsWith("P");
			}
			
			
			
		});
		
	}

	private static void printConditionaly(List<Person> people, Condition condition) {

		for (Person p : people) {
			if (condition.check(p)) {
				
				System.out.println(p);
			}

		}

	}

	// method that prints the person whose name stars with p
	private static void printLastNameWithP(List<Person> people) {

		for (Person p : people) {

			if (p.getLname().startsWith("P")) {

				System.out.println(p);
			}

		}

	}

	// print all method implementation

	private static void printAll(List<Person> people) {

		for (Person p : people) {

			System.out.println(p);
		}

	}

}

// interface condition

interface Condition {

	boolean check(Person p);
}
