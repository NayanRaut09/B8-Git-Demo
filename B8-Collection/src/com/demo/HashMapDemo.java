package com.demo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("Nayan", 98);
		hashMap.put("Ram", 99);
		hashMap.put("Harshad", 95);
		hashMap.put("Siddharth", 97);
		
		
		hashMap.forEach((key,value)-> System.out.println("Name>>" +key + " Marks>>" +value));
		
		
		
	}

}
