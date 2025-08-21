package Lec44;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Raj", 77);
		map.put("Kunal", 67);
		map.put("Ankit", 97);
		map.put("Puneet", 55);
		map.put("Ankita", 78);
		map.put("Pcr", 39);
		map.put("Amisha", 39);
		// map.put(null, 39);
		// map.put("Puneet", 75);
		System.out.println(map);
//		// get
//		System.out.println(map.get("Kaju"));
//		System.out.println(map.get("Amisha"));
//		// ContainsKey
//		System.out.println(map.containsKey("Kaju"));
//		System.out.println(map.containsKey("Amisha"));
//		// reomve
//		System.out.println(map.remove("Kaju"));
//		System.out.println(map.remove("Amisha"));
//		System.out.println(map);
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add
		map1.put("Raj", 77);
		map1.put("Kunal", 67);
		map1.put("Ankit", 97);
		map1.put("Puneet", 55);
		map1.put("Ankita", 78);
		map1.put("Pcr", 39);
		map1.put("Amisha", 39);
		// map1.put(null, 39);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		map2.put("Raj", 77);
		map2.put("Kunal", 67);
		map2.put("Ankit", 97);
		map2.put("Puneet", 55);
		map2.put("Ankita", 78);
		map2.put("Pcr", 39);
		map2.put("Amisha", 39);
		// map2.put(null, 39);
		// map.put("Puneet", 75);
		System.out.println(map2);
//		Set<String> key=map.keySet();
//		for(String k:key) {
//			System.out.println(k+" "+map.get(k));
//		}
		for (String k : map.keySet()) {
			System.out.println(k + " " + map.get(k));
		}

	}

}
