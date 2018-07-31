package com.justcode.lambda.excetion.Lambdathird;

import java.util.Arrays;
import java.util.List;

import common.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
    	
    	people.forEach(System.out::println); 
    }
    
 
}
