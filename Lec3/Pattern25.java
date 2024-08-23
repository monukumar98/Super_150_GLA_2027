package Lec3;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int star = 1;
		int row = 1;
		int space = n - 1;
		int val = 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.out.print(val + "\t");
				val++;
				j++;
			}
			// next row Perp
			System.out.println();
			row++;
			space--;
			star += 2;// star = star + 2;
		}
	}

}
