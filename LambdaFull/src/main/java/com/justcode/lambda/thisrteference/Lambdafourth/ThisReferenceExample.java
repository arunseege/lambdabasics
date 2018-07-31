package com.justcode.lambda.thisrteference.Lambdafourth;

import java.util.function.BiConsumer;

public class ThisReferenceExample {

	public static void main(String[] args) {
		int [] aa ={2,4,5,6,7};
		int a=8;
		int b=7;
		int key=0;
		performaddition(a,b,new BiConsumer<Integer, Integer>() {
			@Override
			public void accept(Integer t, Integer u) {
				t=77;//b=5;
				System.out.println(t+u); 
				System.out.println(this);
				
			}
		});
		
		performaddition(a,b,(t,u) -> {	
			t=87;
				System.out.println(t+u); 
					
		
		});
	}

	private static void performaddition(int a,int b,BiConsumer<Integer, Integer> biConsumer) {
	
		biConsumer.accept(a, b);
		
	}
 }
