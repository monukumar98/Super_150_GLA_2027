package Lec61;

public class SubSequnce_Without_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		SubSequnce(s);
	}

	private static void SubSequnce(String s) {
		// TODO Auto-generated method stub
		int n = s.length();
		for (int i = 0; i < (1 << n); i++) {
			Pattern(s, i);

		}

	}

	private static void Pattern(String s, int i) {
		// TODO Auto-generated method stub
		int idx = 0;
		String ans = "";
		while (i > 0) {
			if ((i & 1) == 1) {
				ans = ans + s.charAt(idx);
			}
			i >>= 1;
			idx++;
		}

	}

}
