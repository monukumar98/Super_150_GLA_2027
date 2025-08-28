package Lec46;

import java.util.*;

public class Group_Anagrams {
	public static void main(String[] args) {
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(group_Anagrams(arr));
	}

	public static List<List<String>> group_Anagrams(String[] arr) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			String key = GetKey(arr[i]);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(arr[i]);
		}
		List<List<String>> ll = new ArrayList<>();
		for (String key : map.keySet()) {
			ll.add(map.get(key));
		}
		return ll;

	}

	public static String GetKey(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq[ch - 'a']++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < freq.length; i++) {
			sb.append(freq[i]+" ");
		}
		return sb.toString();
	}
}
