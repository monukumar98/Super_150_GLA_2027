package Lec24;

public class Maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;// row
		int n = 3;// col
		Print(0, 0, m - 1, n - 1, "");

	}

	// cr--> curr row
	// cc--> curr col
	// er--> end row
	// ec--> end col
	public static void Print(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		Print(cr, cc + 1, er, ec, ans + "H");
		Print(cr + 1, cc, er, ec, ans + "V");

	}

}
