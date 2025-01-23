package Lec24;

public class Coin_Permuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 1, 2, 3, 5 };
		int amount = 5;
		Permuation(coin, amount, "");

	}

	public static void Permuation(int[] coin, int amount, String ans) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < coin.length; i++) {
			if (amount >= coin[i]) {
				Permuation(coin, amount - coin[i], ans + coin[i]);
			}
		}
	}

}

