package com.collection;

import java.util.LinkedHashMap;

public class DemoLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> countrycodes=new LinkedHashMap<String,Integer>();
		
		countrycodes.put("US", 1);
		countrycodes.put("India", 91);
		countrycodes.put("Russia", 7);
		countrycodes.put("Australia", 61);
		countrycodes.put("China", 86);
		countrycodes.put("Pakisthan", 92);
		
		System.out.println(countrycodes);
		System.out.println(countrycodes.size());
		System.out.println(countrycodes.values());
		System.out.println(countrycodes.remove("China", 86));
		System.out.println(countrycodes);

	}

}