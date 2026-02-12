package Lec67;

public class Maximum_XOR_of_Two_Numbers_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 10, 5, 25, 2, 8 };
		Trie t = new Trie();
		for (int x : arr) {
			t.add(x);
		}
		int ans = 0;
		for (int x : arr) {
			ans = Math.max(t.getMaxXor(x), ans);
		}
		System.out.println(ans);
	}

	static class Trie {
		class Node {
			Node zero;
			Node one;

		}

		private Node root = new Node();

		public void add(int val) {
			Node curr = root;
			for (int i = 31; i >= 0; i--) {
				int bit = val & (1 << i);
				if (bit == 0) {
					if (curr.zero != null) {
						curr = curr.zero;
					} else {
						Node nn = new Node();
						curr.zero = nn;
						curr = nn;
					}
				} else {
					if (curr.one != null) {
						curr = curr.one;
					} else {
						Node nn = new Node();
						curr.one = nn;
						curr = nn;
					}
				}

			}
		}

		public int getMaxXor(int x) {
			int ans = 0;
			Node curr = root;
			for (int i = 31; i >= 0; i--) {
				int bit = x & (1 << i);
				if (bit == 0) {
					if (curr.one != null) {
						ans = ans | (1 << i);
						curr = curr.one;
					} else {
						curr = curr.zero;
					}

				} else {
					if (curr.zero != null) {
						ans = ans | (1 << i);
						curr = curr.zero;
					} else {
						curr = curr.one;
					}
				}
			}
			return ans;
		}

	}
}
