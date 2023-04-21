package com.babu.common.questions;

import java.util.HashMap;

public class HashMapInternalWorkTest {

	public static void main(String[] args) {
		HashMap<TestMap, Integer> hashMap = new HashMap<>();
		
		System.out.println("Capacity " + hashMap.size());
		
		TestMap testMap = new TestMap(1, "Babu");
		TestMap testMap2 = new TestMap(1, "Sanju");
		TestMap testMap3 = new TestMap(1, "Vikshi");
		TestMap testMap4 = new TestMap(1, "Kanakayya");
		TestMap testMap5 = new TestMap(1, "A");
		TestMap testMap6 = new TestMap(1, "B");
		TestMap testMap7 = new TestMap(1, "C");
		TestMap testMap8 = new TestMap(1, "D");
		TestMap testMap9 = new TestMap(1, "E");
		
		
		hashMap.put(testMap, 101);
		hashMap.put(testMap2, 102);
		hashMap.put(testMap3, 103);
		hashMap.put(testMap4, 104);
		hashMap.put(testMap5, 105);
		hashMap.put(testMap6, 106);
		hashMap.put(testMap7, 107);
		hashMap.put(testMap8, 108);
		hashMap.put(testMap9, 109);
		
		System.out.println("Capacity " + hashMap.size());
		
		hashMap.entrySet().parallelStream().forEach(entry -> {
			System.out.println(entry.getKey() + " " + entry.getValue());
		});

	}

}
