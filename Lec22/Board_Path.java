package Lec22;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println("\n" + Print(n, 0, ""));

	}

	public static int Print(int n, int curr, String ans) {
		if (curr == n) {
			System.out.print(ans+" ");
			return 1;
		}
		if (curr > n) {
			return 0;
		}
		int x = 0;
		for (int dice = 1; dice <= 3; dice++) {
			x += Print(n, curr + dice, ans + dice);

		}
		return x;
//		Print(n, curr+1, ans+1);
//		Print(n, curr+2, ans+2);
//		Print(n, curr+3, ans+3);

	}

}
