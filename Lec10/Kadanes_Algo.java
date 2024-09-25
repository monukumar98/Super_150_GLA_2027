package Lec10;

public class Kadanes_Algo {
	public static void main(String[] args) {
		int[] arr = { 2, 3, -7, 5, -1, 7 };
		System.out.println(Maximum_Sum(arr));
	}

	public static int Maximum_Sum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			ans = Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}
}
