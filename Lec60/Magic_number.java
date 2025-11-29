package Lec60;

public class Magic_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		System.out.println(Nthnumber(n));

	}

	public static int Nthnumber(int n) {
		int mul = 5;
		int ans = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				ans += mul;
			}
			n >>= 1;
			mul = mul * 5;
		}
		return ans;
	}

}
