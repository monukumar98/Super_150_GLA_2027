package Lec63;

public class Bitwise_XOR_of_All_Pairings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 2, 1, 3 }, nums2 = { 10, 2, 5, 0 };
	}

	public static int All_Pairing(int[] nums1, int[] nums2) {
		int n = nums1.length;
		int m = nums2.length;
		if (n % 2 == 0 & m % 2 == 0) {
			return 0;
		}
		int xor1 = Bitwise_XOR(nums1);
		int xor2 = Bitwise_XOR(nums2);
		if (n % 2 == 1 & m % 2 == 1) {
			return xor1 ^ xor2;
		} else if (n % 2 == 1) {// odd wale array ka even pair hoga inka xor 0 hojaayega
			return xor2;// isliye yaha se even wala return kra hai kyuki inka odd pair hoga
		} else {
			return xor1;
		}

	}

	public static int Bitwise_XOR(int[] arr) {
		int xor = 0;
		for (int v : arr) {
			xor ^= v;// xor=xor^v;
		}
		return xor;

	}

}
