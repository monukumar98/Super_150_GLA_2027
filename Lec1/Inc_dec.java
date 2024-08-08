package Lec1;

public class Inc_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
//		System.out.println(a++);
//		System.out.println(a);
		
		int x = a++ - ++a - 7 + --a + a--;
		System.out.println(x);

	}

}
