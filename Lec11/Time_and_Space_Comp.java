package Lec11;

public class Time_and_Space_Comp {
	public static void main(String[] args) {
		int n = 10000;
//		long start = System.currentTimeMillis();
//
//		for (int i = 0; i < 100000; i++) {
//
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end-start);
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(N)
			i++;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(Log(N)) base 2
			i *= 2;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(Log(N)) base 2
			n /= 2;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(N)
			i += 2;
			i += 3;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(Log(N)) base 6
			i *= 2;
			i *= 3;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(Log(N)) base 6
			n /= 2;
			n /= 3;
		}
		int k = 2;
		while (i <= n) {
			System.out.println("Hey");
			// n/k
			i += k;
		}
		while (i <= n) {
			System.out.println("Hey");
			// O(Log(N)) base k
			i *= k;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(N)
			n = n - 1;
		}
		while (n > 0) {
			System.out.println("Hey");
			// O(N)
			n = n - 2;
			n = n - 3;
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				// O(N^2)
				System.out.println("hey");
			}
		}
		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
			// O(Sqrt(N))
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (k = 1; k <= n / 2; k++) {
					System.out.println("hey");
					// O(N^4)
				}
			}
		}
		for (i = 1; i <= n; i *= 2) {
			System.out.println("hey");
			// O(Log(N)) base 2
		}
		for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for (k = 1; k <= n; k = k * 2) {
					// O(N^2(log(N))
					System.out.println("hey");
				}
			}
		}
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j += i) {
				System.out.println("hey");
			}
		}

	}
}
