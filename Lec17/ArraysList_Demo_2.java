package Lec17;

import java.util.*;

public class ArraysList_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll = new ArrayList<>();
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		ll.add(7);
		ll.add(9);
		System.out.println(ll);
		Collections.sort(ll);
		Collections.reverse(ll);
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		int [] arr = new int [5];
		for(int v:ll) {
			System.out.print(v+" ");
		}
		System.out.println();
		for(int v:arr) {
			System.out.print(v+" ");
		}
	}

}












