package Recursion_Doubt_Class;

import java.util.Scanner;

public class Split_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(SUbSET(arr, 0, "", 0, "", 0));

	}

	public static int SUbSET(int[] arr, int idx, String ans1, int sum1, String ans2, int sum2) {
		if (idx == arr.length) {
			if (sum1 == sum2) {
				System.out.println(ans1 + " and " + ans2);
				return 1;
			}
			return 0;
		}
		int a = SUbSET(arr, idx + 1, ans1 + arr[idx]+" ", sum1 + arr[idx], ans2, sum2);
		int b = SUbSET(arr, idx + 1, ans1, sum1, ans2 + arr[idx]+" ", sum2 + arr[idx]);
		return a + b;
	}
}
