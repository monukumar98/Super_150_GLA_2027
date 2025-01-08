package Lec20;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int n = 4;
		System.out.println(pow(a, n));
	}

	public static int pow(int a, int n) {
		if(n==0) {
			return 1;
		}
		int ans=pow(a, n-1);
		return ans*a;

	}
}

