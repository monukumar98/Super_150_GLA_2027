package Lec63;

public class Neighboring_Bitwise_XOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] derived = { 1, 1, 0 };
	}

	public static boolean doesValidArrayExist(int[] derived) {
		int xor = 0;
		for (int v : derived) {
			xor ^= v;// xor=xor^v;
		}
		return xor == 0;

	}

}
