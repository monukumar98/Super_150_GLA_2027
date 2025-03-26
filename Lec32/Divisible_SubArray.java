package Lec32;

public class Divisible_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 6 };
		System.out.println(Count_SubArray(arr));
	}

	public static long Count_SubArray(int[] arr) {
		int n = arr.length;
		long[] freq = new long[n];
		long sum = 0;
		freq[0] = 1;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			int rem = (int) (sum % n);
			if (rem < 0) {
				rem += n;// -ve
			}
			freq[rem]++;
		}
		long ans = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] >= 2) {
				long x = freq[i];
				ans += (x * (x - 1)) / 2;
			}
		}
		return ans;
	}

}
