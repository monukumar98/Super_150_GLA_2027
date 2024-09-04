package Lec6;

public class Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		System.out.println(arr);
		int[] other = arr;
		System.out.println(other.length);
		// set
		arr[0] = 9;
		arr[1] = 15;
		arr[2] = -2;
		arr[3] = 6;
		arr[4] = 11;

		// print
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		int[] ar = { 10, 2, 3, 4, 4 };
		int[] ar1 = new int []{ 10, 2, 3, 4, 4 };

	}

}








