/*
*  Created by
*  @Author Avanish Patel
*/

package stream;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {
	
	public static void main(String[] args) throws IOException {
		
		// Integer stream
		
		IntStream
		.range(1, 10)
		.forEach(System.out::println);
		
		System.out.println();
		
		// Integer stream with skip
		
		IntStream
		.range(1, 10)
		.skip(5)
		.forEach(x -> System.out.println(x));
		
		System.out.println();
		
		// Integer with sum
		
		long sum = IntStream
				.range(1, 5)
				.sum();
		
		System.out.println(sum);
		System.out.println();
		
		// stream.of , sorted and findFirst
		
		Stream.of("Avanish","Dixit","Raj","Mehul","Ajay")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		
		System.out.println();
		// Stream with arrays
		
		String names[] = {"Avanish","Dixit","Raj","Mehul","Ajay"};
		
		Arrays.stream(names)
		.filter(x -> x.startsWith("A"))
		.sorted()
		.forEach(x -> System.out.println(x));
		
		// arrays of int
		
		Arrays.stream(new int[] {1,2,3,4,5,6})
		.map(x -> x*x)
		.forEach(System.out::println);
		
		
		System.out.println();
		// integer average
		
		Arrays.stream(new int[] {1,2,3,4,5,6})
		.map(x -> x * x)
		.average()
		.ifPresent(System.out::println);
		
		System.out.println();
		
		// list, filter, and print
		
		List<String> people = Arrays.asList("Avanish","Dixit","Raj","Mehul","Ajay");
		
		people.stream()
		.map(String::toLowerCase)
		.filter(x -> x.startsWith("a"))
		.forEach(System.out::println);
		
		
		// Stream rows from text file , filter and print
		
//		Stream<String> fruits = Files.lines(Paths.get("fruits.txt"));
//		
//		fruits
//		.sorted()
//		.filter(x -> x.length() > 7)
//		.forEach(System.out::println);
//		
//		fruits.close();
		
		
		
		
	}

}
