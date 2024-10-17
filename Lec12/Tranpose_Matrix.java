package Lec12;

public class Tranpose_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 2, 3, 4, 5 }, { 1, 8, 9, 7 }, { 12, 56, 78, 23 }, { 6, 14, 15, 16 } };
		Tranpose(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void Tranpose(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr[0].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

	}
}
