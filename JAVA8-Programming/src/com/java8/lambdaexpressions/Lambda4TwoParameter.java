package com.java8.lambdaexpressions;

  interface Person4
  {
	  abstract public void eat(String foodName1,String foodNme2);
  }

public class Lambda4TwoParameter {
	

	public static void main(String[] args) {
		
		Person4 p4=(foodName1,foodName2)-> {
			
			 {
				System.out.println("Eat .. Drink: "+foodName1+foodName2);
			}
		} ; 
		p4.eat("Milk","Sugar");
		}

	}


