package com.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo4_Skip {

	public static void main(String[] args) {
		
		List<Integer> listInt= Arrays.asList(11,33,44,5,66,33,44);
		
		listInt.stream().skip(4).forEach(System.out::println);
	}

}
