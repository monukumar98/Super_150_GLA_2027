package Lec46;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(Fib(n));
		int[] dp = new int[n + 1];
		System.out.println(FibTD(n, dp));

	}

	public static int FibBU(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}

	public static int FibTD(int n, int[] dp) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (dp[n] != 0) {// dp apply kra hai
			return dp[n];
		}
		int f1 = FibTD(n - 1, dp);
		int f2 = FibTD(n - 2, dp);
		return dp[n] = f1 + f2;// yaad kra hai

	}

	public static int Fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int f1 = Fib(n - 1);
		int f2 = Fib(n - 2);
		return f1 + f2;

	}
}
