package Lec5;

import java.util.Scanner;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		int star = 1;
		while (row < n) {
			// star
			int i = 0;
			int ncr=1;
			while (i < star) {
				System.out.print(ncr+" ");
				ncr = ((row - i) * ncr) / (i + 1);
				i++;
			}
			// next row ki prep
			System.out.println();
			row++;
			star++;
		}

	}

}
