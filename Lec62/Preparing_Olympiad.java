package Lec62;

import java.util.Scanner;

public class Preparing_Olympiad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int r = sc.nextInt();
		int x = sc.nextInt();
		int[] c = new int[n];
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.nextInt();
		}
		System.out.println(Number_Way(c, l, r, x));

	}

	public static int Number_Way(int[] c, int l, int r, int x) {
		int n = c.length;
		int count = 0;
		for (int i = 3; i < (1 << n); i++) {
			if (Fast_Count_SetBit(i) >= 2 & isitpossible(c, l, r, x, i)) {
				count++;
			}

		}
		return count;

	}

	public static boolean isitpossible(int[] c, int l, int r, int x, int i) {
		int sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, idx = 0;
		while (i > 0) {
			if ((i & 1) == 1) {
				sum += c[idx];
				min = Math.min(min, c[idx]);
				max = Math.max(max, c[idx]);
			}
			i >>= 1;
			idx++;
		}
		return sum >= l & sum <= r & max - min >= x;

	}

	public static int Fast_Count_SetBit(int n) {
		int ans = 0;
		while (n > 0) {
			ans++;
			n = n & (n - 1);
		}
		return ans;
	}

}
