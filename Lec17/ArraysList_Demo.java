package Lec17;

import java.util.*;

public class ArraysList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		System.out.println(ll);
		ll.add(1, 9);// O(N)
		System.out.println(ll);
		System.out.println(ll.get(2));//O(1)
		System.out.println(ll.remove(2));//O(N)
		System.out.println(ll);
		System.out.println(ll.size());
		ll.set(1, 101);//O(1)
		System.out.println(ll);

	}

}
