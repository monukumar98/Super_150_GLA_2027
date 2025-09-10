package Lec49;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -66666);
		}
		for (int col = 0; col < matrix[0].length; col++) {
			ans = Math.min(ans, Minimum_Falling_Path(matrix, 0, col, dp));
		}
		System.out.println(ans);
	}

	public static int Minimum_Falling_Path(int[][] matrix, int cr, int cc, int[][] dp) {
		if (cr == matrix.length - 1) {
			return matrix[cr][cc];
		}
		if (dp[cr][cc] != -66666) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matrix[0].length; i++) {
			if (i == cc) {
				continue;
			}
			ans = Math.min(ans, Minimum_Falling_Path(matrix, cr + 1, i, dp));
		}
		return dp[cr][cc] = ans+ matrix[cr][cc];
	}
}
