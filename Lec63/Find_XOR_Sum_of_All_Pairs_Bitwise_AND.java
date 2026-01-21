package Lec63;

public class Find_XOR_Sum_of_All_Pairs_Bitwise_AND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1 = {1,2,3}, arr2 = {6,5};
		int xor1=Bitwise_XOR(arr1);
		int xor2=Bitwise_XOR(arr2);
		System.out.println(xor1&xor2);
	}
	public static int Bitwise_XOR(int[] arr) {
		int xor = 0;
		for (int v : arr) {
			xor ^= v;// xor=xor^v;
		}
		return xor;

	}
}
