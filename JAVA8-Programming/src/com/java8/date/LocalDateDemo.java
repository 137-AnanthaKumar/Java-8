package com.java8.date;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		
		
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate.toString());
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfYear());
	}

}
