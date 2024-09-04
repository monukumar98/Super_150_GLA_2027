package Lec6;

public class Fun_Demo_3 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int a = 8;
		int b = 7;
		System.out.println(val);
		System.out.println(Add(a, b));
		System.out.println(val);
		System.out.println("Bye");

	}

	public static int Add(int a, int b) {

		int c = a + b;
		int val = 90;
		Fun_Demo_3.val = Fun_Demo_3.val - 5;
		return c + sub(c, a);

	}

	public static int sub(int a, int b) {

		return a - b;

	}

}
