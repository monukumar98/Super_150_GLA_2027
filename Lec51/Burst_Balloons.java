package Lec51;

public class Burst_Balloons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 1, 5, 8 };
		int[] a = new int[arr.length + 2];
		a[0] = a[a.length - 1] = 1;
		for (int i = 0; i < arr.length; i++) {
			a[i + 1] = arr[i];
		}
		System.out.println(Burst_Coin(a, 0, a.length - 1));
	}

	public static int Burst_Coin(int[] a, int i, int j) {
		if (i + 1 == j) {
			return 0;
		}
		int ans = Integer.MIN_VALUE;
		for (int k = i + 1; k < j; k++) {
			int left = Burst_Coin(a, i, k);
			int right = Burst_Coin(a, k, j);
			int self = a[i] * a[j] * a[k];
			ans = Math.max(ans, left + right + self);
		}
		return ans;

	}

}
