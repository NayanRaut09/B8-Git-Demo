package com.demo;

import java.util.ArrayList;

public class ArrayListDemo {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Nayan");
		arrayList.add("Ram");
		arrayList.add("Sejal");
		arrayList.add("Sonal");
		arrayList.add("Pratik");
		arrayList.add("Pawan");
		arrayList.add("Harshad");
		arrayList.add("Sidharth");
		
		for(String s : arrayList) {
			System.out.println(s);
		}
		
		
		
		
	}

}
