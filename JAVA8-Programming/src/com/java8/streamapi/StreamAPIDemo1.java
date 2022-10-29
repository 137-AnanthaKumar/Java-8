package com.java8.streamapi;

import java.util.Arrays;
import java.util.List;
public class StreamAPIDemo1 {

	public static void main(String[] args) {
		
		
		  List<Integer>listInt = Arrays.asList(1,2, 3,4,5,6);
		  
		 // for(int i=0;i<6;i++)
		 //   System.out.println(listInt.get(i));
		  
		  listInt.stream().forEach(System.out::println);

	}

}
