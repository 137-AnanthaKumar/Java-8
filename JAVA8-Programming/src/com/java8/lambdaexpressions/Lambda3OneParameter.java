package com.java8.lambdaexpressions;

  interface Person3
  {
	  abstract public void eat(String foodName);
  }

public class Lambda3OneParameter {
	

	public static void main(String[] args) {
		
		Person3 p3=(foodName)-> {
			
			 {
				System.out.println("Eat .. Drink: "+foodName);
			}
		} ; 
		p3.eat("Milk");
		}

	}


