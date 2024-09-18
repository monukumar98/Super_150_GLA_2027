package lec8;

public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
	}

	public static int Moore_Voting(int[] arr) {
		int e=arr[0];
		int v=1;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]==e) {
				v++;
			}
			else {
				v--;
				if(v==0) {
					e=arr[i];
					v=1;
				}
			}
		}
		return e;

	}
}
