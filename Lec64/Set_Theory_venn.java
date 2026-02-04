package Lec64;

public class Set_Theory_venn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5 };
		int n = 1000;
		System.out.println(venn_Diagram(arr, n));
		

	}

	public static int venn_Diagram(int[] arr, int n) {
		int l = arr.length;
		int count = 0;
		for (int i = 1; i < (1 << l); i++) {
			int ans = Power_Set(arr, n, i);
			if (set_bit(i) % 2 == 0) {
				count -= ans;
			} else {
				count += ans;
			}

		}
		return count;

	}

	private static int set_bit(int i) {
		// TODO Auto-generated method stub
		int c = 0;
		while (i > 0) {
			i = (i & (i - 1));
			c++;
		}
		return c;
	}

	public static int Power_Set(int[] arr, int n, int i) {
		int ans = 1;
		int idx = 0;
		while (i > 0) {
			if ((i & 1) != 0) {
				ans = ans * arr[idx];
			}
			idx++;
			i >>= 1;
		}
		return n / ans;
	}

}
