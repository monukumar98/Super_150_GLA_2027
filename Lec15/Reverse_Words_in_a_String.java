package Lec15;

import java.util.Arrays;

public class Reverse_Words_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "    the sky  p is  p    blue    p    ";
		s = s.trim();
		System.out.println(s);
		String[] arr = s.split("\s+");
		// System.out.println(Arrays.toString(arr));
		String ans = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			ans = ans + arr[i] + " ";
		}
		System.out.println(ans);
	}

}
