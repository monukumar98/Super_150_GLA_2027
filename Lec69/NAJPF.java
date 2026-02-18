package Lec69;

import java.util.*;

public class NAJPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			String p = sc.next();
			List<Integer> ll = Rabin_karp(s, p);
			StringBuilder sb = new StringBuilder();
			if (ll.size() == 0) {
				sb.append("Not Found\n");
			} else {
				sb.append(ll.size() + "\n");
				for (int x : ll) {
					sb.append(x + " ");
				}
				sb.append("\n");
			}
			System.out.println(sb.toString());
		}

	}

	public static List<Integer> Rabin_karp(String s, String p) {
		List<Integer> ll = new ArrayList<Integer>();
		if (p.length() > s.length()) {
			return ll;
		}
		// pattern
		long hv = 0;
		long pow = 1;
		long pr = 31;
		long mod = 1000_000_007;
		for (int i = 0; i < p.length(); i++) {
			hv = (hv + ((p.charAt(i) - 'a' + 1) * pow) % mod) % mod;
			pow = (pow * pr) % mod;

		}
		// Text
		long[] dp = new long[s.length()];
		long[] pa = new long[s.length()];
		pa[0] = 1;
		pow = 31;
		dp[0] = s.charAt(0) - 'a' + 1;
		for (int i = 1; i < s.length(); i++) {
			dp[i] = (dp[i - 1] + ((s.charAt(i) - 'a' + 1) * pow) % mod) % mod;
			pa[i] = pow;
			pow = (pow * pr) % mod;

		}
		// ans calculate

		int n = p.length();
		if (dp[n - 1] == hv) {
			ll.add(1);
		}
		for (int i = n; i < s.length(); i++) {
			int k = i - n;
			long curr = (dp[i] - dp[k] + mod) % mod;
			if (curr == (hv * pa[k + 1] % mod)) {
				ll.add(k + 2);
			}
		}

		return ll;

	}

}
