package Lec35;

import java.util.*;
import java.util.Scanner;

public class BUSYMAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			Pair[] arr = new Pair[n];
			for (int i = 0; i < n; i++) {
				int st = sc.nextInt();
				int et = sc.nextInt();
				arr[i] = new Pair(st, et);

			}
			Arrays.sort(arr, new Comparator<Pair>() {

				@Override
				public int compare(Pair o1, Pair o2) {
					// TODO Auto-generated method stub
					return o1.et - o2.et;
				}

			});
			int activitie = 1;
			int end = arr[0].et;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i].st >= end) {
					activitie++;
					end = arr[i].et;
				}
			}
			System.out.println(activitie);
		}

	}

	static	 class Pair {
		int st;
		int et;

		public Pair(int st, int et) {
			// TODO Auto-generated constructor stub
			this.st = st;
			this.et = et;
		}
	}

}
