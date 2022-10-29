package com.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo5_Map {

	public static void main(String[] args) {
		
		List<String> mylist= Arrays.asList("Hello","Stream","Learning");
		
		mylist.stream().map(str->str.length()).forEach(System.out::println);
	}

}
