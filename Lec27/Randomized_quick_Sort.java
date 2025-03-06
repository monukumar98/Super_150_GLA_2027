package Lec27;

import java.util.Random;

public class Randomized_quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 2, 1, 8, 3, 4 };
		Sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Sort(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if (si >= ei) {
			return;
		}
		int idx = Partition(arr, si, ei);
		Sort(arr, si, idx - 1);
		Sort(arr, idx + 1, ei);

	}

	public static int Partition(int[] arr, int si, int ei) {// konsa idndex
		Random rn = new Random();
		int ri=rn.nextInt(ei-si)+si;
		int tt = arr[ei];
		arr[ei] = arr[ri];
		arr[ri] = tt;
		int item = arr[ei];
		int idx = si;
		for (int i = si; i < ei; i++) {
			if (arr[i] <= item) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = temp;
				idx++;
			}
		}
		int temp = arr[ei];
		arr[ei] = arr[idx];
		arr[idx] = temp;
		return idx;
	}

}
