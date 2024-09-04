package Lec6;

public class Fun_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Add();
		System.out.println("Bye");

	}

	public static void Add() {
		int a = 8;
		int b = 7;
		int c = a + b;
		sub();
		System.out.println(c);
	}

	public static void sub() {
		int a = 8;
		int b = 7;
		int c = a - b;
		System.out.println(c);
	}

}
