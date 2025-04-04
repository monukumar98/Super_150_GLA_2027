package Lec34;

public class Generics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 10, 20, 40, 4, 60 };
		Dispaly(arr);
		String[] arr1 = { "Kaju", "Raju", "Ankit", "Ankita", "Kunal" };
		Dispaly(arr1);
	}

	public static <T> void Dispaly(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static <T> T get(T[] arr) {
		return arr[0];
	}

}




