package Recursion_Doubt_Class;

import java.util.Scanner;

public class Subset_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		System.out.println("\n" + SUbSET(arr, 0, "", 0, target));
	}

	public static int SUbSET(int[] arr, int idx, String ans, int sum, int target) {
		if (idx == arr.length) {
			if (sum == target) {
				System.out.print(ans + " ");
				return 1;
			}
			return 0;
		}

		int a = SUbSET(arr, idx + 1, ans + arr[idx] + " ", sum + arr[idx], target);
		int b = SUbSET(arr, idx + 1, ans, sum, target);
		return a + b;
	}

}
