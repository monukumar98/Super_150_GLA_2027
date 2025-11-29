package Lec60;

public class Count_Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;

	}

	public static int Fast_Count_SetBit(int n) {
		int ans = 0;
		while (n > 0) {
			ans++;
			n = n & (n - 1);
		}
		return ans;
	}

	public static int Count_SetBit(int n) {
		int ans = 0;
		while (n > 0) {
			if ((n & 1) != 0) {
				ans++;
			}
			n >>= 1;// n=n>>1;
		}
		return ans;
	}
}
