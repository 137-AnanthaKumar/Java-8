package com.java8.lambdaexpressions;
import java.util.ArrayList;
import java.util.List;
public class Lambda5Prog {

	public static void main(String[] args) {
		
		
		List<String> mygames = new ArrayList<String>();
		
		mygames.add("Chess ");
		mygames.add("Hocky ");
		mygames.add("Kabaddi ");
		mygames.add("Cricket");
		
		
		//for(String  names:mygames)
		//	System.out.println(names);
		
		  mygames.forEach(names->System.out.println(names));
   
	}

}
