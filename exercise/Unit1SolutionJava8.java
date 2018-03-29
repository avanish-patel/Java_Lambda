/*
*  Created by
*  @Author Avanish Patel
*/

package exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1SolutionJava8 {
	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				
				new Person("Avanish", "Patel", 24),
				new Person("Sam", "Steve", 35),
				new Person("Devid", "Backham", 35),
				new Person("Raj", "Patel",21),
				new Person("Chirag", "Andrew", 23)
				);
		
		// sort the people according to last name
		
		Collections.sort(people, (o1,o2) -> o1.getLname().compareTo(o2.getLname()));
		
		// print all the person
		
		System.out.println("Print all people in list");
		
		printConditionaly(people, p -> true);
		
		// print person whose last name starts with p
		
		System.out.println("Print the person whose last name starts with P");
		
		printConditionaly(people, p -> p.getLname().startsWith("P"));
		
		// print the person whose first name start with A
		
		System.out.println("Print the person whose first name starts with A");
		printConditionaly(people, p -> p.getFname().startsWith("A"));
		
				
	}
	
	
	private static void printConditionaly(List<Person> people, ConditionCheck conditionCheck) {
		
		for(Person p: people) {
			
			if (conditionCheck.check(p)) {
				
				System.out.println(p);
			}
		}
		
	}

}

// interface that check the condition method
interface ConditionCheck{
	
	boolean check(Person p);
}
