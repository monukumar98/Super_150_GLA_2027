package Lec44;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(31);
		set.add(7);
		set.add(-3);
		set.add(11);
		set.add(39);
		System.out.println(set);
//		// contains
//		System.out.println(set.contains(1));
//		System.out.println(set.contains(9));
//		// remove
//		System.out.println(set.remove(1));
//		System.out.println(set.remove(9));
//		System.out.println(set);
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(1);
		set1.add(31);
		set1.add(7);
		set1.add(-3);
		set1.add(11);
		set1.add(39);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		set2.add(1);
		set2.add(31);
		set2.add(7);
		set2.add(-3);
		set2.add(11);
		set2.add(39);
		System.out.println(set2);
		for(int x:set) {
			System.out.print(x+" ");
		}
		System.out.println();
		for(int x:set1) {
			System.out.print(x+" ");
		}
		System.out.println();
		for(int x:set2) {
			System.out.print(x+" ");
		}
		System.out.println();
	}

}
