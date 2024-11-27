package Lec19;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababbabbaaaaababab";
		int k = 2;
		int flip_a = Maxlen(s, 'a', k);
		int flip_b = Maxlen(s, 'b', k);
		System.out.println(Math.max(flip_a, flip_b));

	}

	public static int Maxlen(String s, char ch, int k) {
		int si = 0, ei = 0, flip = 0, ans = 0;
		while (ei < s.length()) {
			// grow
			if (s.charAt(ei) == ch) {
				flip++;
			}
			// shrink
			while (flip > k && si<=ei) {
				if (s.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			// ans update
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;

	}
}
