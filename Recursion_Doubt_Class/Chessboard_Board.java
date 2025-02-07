package Recursion_Doubt_Class;

import java.util.Scanner;

public class Chessboard_Board {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Print_Chessboard(n, 0, 0, n - 1, n - 1, "");
		System.out.println("\n" + c);

	}

	static int c = 0;

	public static void Print_Chessboard(int n, int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cr == cc) {
			System.out.print(ans + "{" + cr + "-" + cc + "}" + " ");
			c++;
			return;
		}
		if (cr >= n || cc >= n) {
			return;
		}
		// a knight, only the positive ones are valid
		Print_Chessboard(n, cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K");
		Print_Chessboard(n, cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K");
		// rook
		if (cr == er || cc == ec || cr == 0 || cc == 0) {
			// horizontally
			for (int i = 1; i <= n; i++) {
				Print_Chessboard(n, cr, cc + i, er, ec, ans + "{" + cr + "-" + cc + "}R");
			}
			// vertically
			for (int i = 1; i <= n; i++) {
				Print_Chessboard(n, cr + i, cc, er, ec, ans + "{" + cr + "-" + cc + "}R");
			}
		}
		// bishop
		if (cr == cc || (cr + cc == ec)) {
			for (int i = 1; i <= n; i++) {
				Print_Chessboard(n, cr + i, cc + i, er, ec, ans + "{" + cr + "-" + cc + "}B");
			}
		}
	}
}
