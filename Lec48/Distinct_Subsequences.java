package Lec48;

public class Distinct_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit", t = "rabbit";
	}

// s--> coin | t--> amount | i--> s | j-->t
	public static int Coin_Change(String s, String t, int i, int j) {
		if (j == t.length()) {
			return 1;
		}
		if (i == s.length()) {
			return 0;
		}
		int inc = 0, exc = 0;
		if (s.charAt(i) == t.charAt(j)) {
			inc = Coin_Change(s, t, i + 1, j + 1);
		}
		exc = Coin_Change(s, t, i + 1, j);
		return inc + exc;
	}
}
