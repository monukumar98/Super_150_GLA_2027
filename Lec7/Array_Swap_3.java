package Lec7;

public class Array_Swap_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 1, 7, 8 };
		int[] other = { 31, 51, 11, 71, 81 };
		System.out.println(arr[0] + " " + other[0]);
		swap(arr, other);
		System.out.println(arr[0] + " " + other[0]);
	}

	public static void swap(int[] arr, int[] other) {
		// TODO Auto-generated method stub
		int[] temp = arr;
		arr = other;
		other = temp;

	}

}
