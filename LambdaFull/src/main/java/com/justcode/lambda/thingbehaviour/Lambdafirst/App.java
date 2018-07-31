package com.justcode.lambda.thingbehaviour.Lambdafirst;

import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Greeter greeter = new GreetinginEnglish();
        greeting(greeter);
        
        Greeter greeter2 = new Greeter() {
			
			@Override
			public void greet() {
				System.out.println("hello world anony,ous way");
				
			}
		};
		greeter2.greet();
		
		Runnable  supplier = () -> System.out.println("greeter2 lambda way");
		supplier.run();
    }
    
   static  void greeting(Greeter greeter){
    	greeter.greet();
    }
}
