package Lec45;

import java.util.HashSet;

public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };

	}

	public static int Longest_Consecutive(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if (!set.contains(arr[i] - 1)) {
				int c = 0;
				int key = arr[i];
				while (set.contains(key)) {
					set.remove(key);
					c++;
					key++;
				}
				ans = Math.max(ans, c);

			}
		}
		return ans;

	}

}
