package com.collection.list;

import java.util.ArrayList;
import java.util.List;

public class RemoveMethodinArrayList {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Grapes");
		
		System.out.println(fruits);
		
		fruits.remove(3);
		System.out.println(fruits);
		
		List<String> subfruitsList=new ArrayList <>();
		subfruitsList.add("Apple");
		subfruitsList.add("Banana");
		fruits.removeAll(subfruitsList);
		
		System.out.println("subfruits" +fruits);
		
		fruits.clear();
		System.out.println(fruits);
		

	}

}
