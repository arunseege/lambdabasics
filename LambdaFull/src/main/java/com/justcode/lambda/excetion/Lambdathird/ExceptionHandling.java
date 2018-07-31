package com.justcode.lambda.excetion.Lambdathird;

import java.util.function.BiConsumer;

public class ExceptionHandling {

	public static void main(String[] args) {
		int [] aa ={2,4,5,6,7};
		int key=0;
		performOperation(aa,key,wrapperlambda((a,k) -> System.out.println(a/k)));
	}
	private static BiConsumer<Integer, Integer> wrapperlambda(BiConsumer<Integer, Integer> biConsumer) {
		System.out.println("inside wrapper");
		return (k,v) -> {
			
			try {			
				biConsumer.accept(k, v);
			} catch (Exception e) {
			System.out.println("/ by Zero Exception");
			}
			
		};
	}
	static  void performOperation(int a[],int key,BiConsumer<Integer, Integer> biConsumer){ 
		for(int i:a){
			biConsumer.accept(i, key); 
		}
	}
 }
