package stream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import exercise.Person;

/*
*  Created by
*  @Author Avanish Patel
*/

public class StreamAPI {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(

				new Person("Avanish", "Patel", 24), new Person("Sam", "Steve", 35), new Person("Devid", "Backham", 35),
				new Person("Raj", "Patel", 21), new Person("Chirag", "Andrew", 23)

		);
		// consumer return void and predicate return boolean
		// apply stream to collection people and use foreach
		
		people.stream()
		.forEach((p) -> System.out.println(p));
		
		// apply filter
		
		people.stream()
		.filter(p -> p.getFname().startsWith("A"))
		.forEach(p -> System.out.println(p));
		
		
		long count = people.stream()
		.filter(p -> p.getLname().startsWith("P"))
		.count();
		
		System.out.println(count);
		
		// use parallelstream instead of stream to enable multi`core execution
		
		// pipeline = source -> operations -> termination
	}

}
