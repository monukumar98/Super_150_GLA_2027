package Lec22;
import java.util.*;
public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> ll = new ArrayList<>();
		Parentheses(n, 0, 0, "",ll);
		System.out.println(ll);

	}

	public static void Parentheses(int n, int closed, int open, String ans,List<String> ll) {
		if (open == n && closed == n) {
			//System.out.println(ans);
			ll.add(ans);
			return;
		}
		if (open > n || closed > open) {
			return;
		}

		Parentheses(n, closed, open + 1, ans + "(",ll);
		Parentheses(n, closed + 1, open, ans + ")",ll);
	}

}
