package Lec28;

import java.util.Stack;

public class Stack_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		System.out.println(st.capacity());
		st.push(10);//add
		st.push(20);//add
		st.push(30);//add
		st.push(40);//add
		st.push(50);//add
		st.push(60);//add
		st.push(70);//add
		st.push(80);//add
		st.push(90);//add
		st.push(1000);//add
		st.push(100);//add
		System.out.println(st.peek());
		System.out.println(st.size());
	//	System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.capacity());

		

	}

}
