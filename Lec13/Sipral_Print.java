package Lec13;

public class Sipral_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		Print(arr);
	}

	public static void Print(int[][] arr) {
		// TODO Auto-generated method stub
		int minc = 0, minr = 0, maxc = arr[0].length - 1, maxr = arr.length - 1;
		int te = arr.length * arr[0].length;
		int c = 0;
		while (c < te) {
			for (int i = minc; i <= maxc && c < te; i++) {
				System.out.print(arr[minr][i] + " ");
				c++;
			}
			minr++;
			for (int i = minr; i <= maxr && c < te; i++) {
				System.out.print(arr[i][maxc] + " ");
				c++;
			}
			maxc--;
			for (int i = maxc; i >= minc && c < te; i--) {
				System.out.print(arr[maxr][i] + " ");
				c++;
			}
			maxr--;
			for (int i = maxr; i >= minr && c < te; i--) {
				System.out.print(arr[i][minc] + " ");
				c++;
			}
			minc++;
		}
	}

}
