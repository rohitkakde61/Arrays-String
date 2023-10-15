package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {

	public static void main(String[] args) {
		
		List<String> topProgrammingLanguages = new ArrayList();
		
		System.out.println("Is the topProgrammingLanguages list empty?:" + topProgrammingLanguages.isEmpty());
		
		topProgrammingLanguages.add("C");
		topProgrammingLanguages.add("Java");
		topProgrammingLanguages.add("C++");
		topProgrammingLanguages.add("Python");
		topProgrammingLanguages.add(".net");
		
		
		System.out.println("Here are the top" + topProgrammingLanguages.size());
		
String bestProgrammingLang = topProgrammingLanguages.get(1);
 System.out.println("bestProgrammingLang=>" +bestProgrammingLang);
 
 
 
 String secondProgrammingLang = topProgrammingLanguages.get(3);
 
System.out.println(" secondProgrammingLang =>" +  secondProgrammingLang);
topProgrammingLanguages.set(4, "c++");
System.out.println("topProgrammingLanguages");
	}

}
