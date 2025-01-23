package Lec24;

public class Queen_Permuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int tq = 2;// total Queen
		boolean[] board = new boolean[n];
		Permuation(board, tq, "", 0);

	}

	public static void Permuation(boolean[] board, int tq, String ans, int qpsf) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] != true) {
				board[i] = true;
				Permuation(board, tq, ans + "b" + i + "q" + qpsf, qpsf + 1);
				board[i] = false;
			}

		}
	}

}
