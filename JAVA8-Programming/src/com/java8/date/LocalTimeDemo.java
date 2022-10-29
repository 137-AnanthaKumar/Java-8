package com.java8.date;

import java.lang.System.Logger;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		 
		LocalDateTime localdateTime = LocalDateTime.now();
		
		System.out.println(localdateTime.getDayOfWeek());
		System.out.println(localdateTime.getDayOfMonth());
		System.out.println(localdateTime.getHour());
		System.out.println(localdateTime.getNano());
	
	}

}
