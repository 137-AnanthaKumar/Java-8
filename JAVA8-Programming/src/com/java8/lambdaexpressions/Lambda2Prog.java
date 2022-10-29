package com.java8.lambdaexpressions;

  interface Person2
  {
	  abstract public void eat();
  }

public class Lambda2Prog {
	

	public static void main(String[] args) {
		
		Person2 p2=()-> {
			
			 {
				System.out.println("RichFood");
			}
		} ; 
		p2.eat();
		}

	}


