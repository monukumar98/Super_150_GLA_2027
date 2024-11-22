package Lec18;

import java.util.*;

public class Arrays_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 3, 5, 9 };
		int[] arr2 = { 7, 8, 0, 1, 3, 5 };

	}

	public static void Add(int[] arr1, int[] arr2) {
		List<Integer> ll = new ArrayList<>();
		int i = arr1.length - 1, j = arr2.length - 1, carry = 0;
		while (i >= 0 && j >= 0) {
			int sum = arr1[i] + arr2[j] + carry;
			ll.add(sum % 10);
			carry = sum / 10;
			i--;
			j--;
		}
		while (i >= 0) {
			int sum = arr1[i] + carry;
			ll.add(sum % 10);
			carry = sum / 10;
			i--;
		}
		while (j >= 0) {
			int sum = arr2[j] + carry;
			ll.add(sum % 10);
			carry = sum / 10;
			j--;
		}
		if (carry > 0) {
			ll.add(carry);
		}
		for (i = ll.size() - 1; i >= 0; i--) {
			System.out.print(ll.get(i) + ", ");
		}
		System.out.println("END");
	}

}




