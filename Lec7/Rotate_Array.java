package Lec7;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		Rotate(arr, k);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void Rotate(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		while (k > 0) {
			int item = arr[n - 1];
			for (int i = n - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = item;
			k--;
		}
	}
}
