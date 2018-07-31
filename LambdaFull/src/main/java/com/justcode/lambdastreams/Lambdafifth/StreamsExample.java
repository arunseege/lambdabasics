package com.justcode.lambdastreams.Lambdafifth;

import java.util.Arrays;
import java.util.List;

import common.Person;

public class StreamsExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		long count = people.stream().filter((p) -> p.getFirstName().startsWith("C")).count();
		System.out.println(count);
		
		people.stream().filter((p) -> p.getLastName().startsWith("C")).forEach(System.out::println); 
	
	}

	
 }
