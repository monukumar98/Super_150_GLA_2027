package Lec16;

public class Playing_with_Good_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int Good_String(String s) {
		int ans=0;
		int c=0;
		for (int i = 0; i < s.length(); i++) {
			char ch =s.charAt(i);
			if(isvowels(ch)) {
				c++;
			}
			else {
				ans=Math.max(ans, c);
				c=0;
			}
		}
		ans=Math.max(ans, c);
		return ans;
	}
	public static boolean isvowels(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}
}
