package Lec22;

public class Lexicographical_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		print(n, 0);

	}

	public static void print(int n, int curr) {
		if (curr > n) {
			return;
		}
		System.out.println(curr);
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			print(n, curr * 10 + i);
		}

	}

}
