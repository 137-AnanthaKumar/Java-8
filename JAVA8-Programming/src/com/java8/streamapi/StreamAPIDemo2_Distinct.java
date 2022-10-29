package com.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo2_Distinct {

	public static void main(String[] args) {
		
		List<Integer> listInt= Arrays.asList(11,33,44,5,66,33,44);
		
		listInt.stream().limit(4).forEach(System.out::println);
	}

}
