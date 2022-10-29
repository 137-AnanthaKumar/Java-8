package com.java8.lambdaexpressions;
@FunctionalInterface
 interface Add {
	 public int addition(int a,int b);
 }

public class Lambda6FunctionInterface {
	

	public static void main(String[] args) {
		  
		Add add=(int a,int b) ->
		{
				
		 int sum= a+b;
		 return sum;
		};
		
		int sum= add.addition(2,2);
		System.out.println("Sum Value :"+sum); 	
		 
	}

}
