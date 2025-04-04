package Lec34;

public class Stack_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	StackI st = new StackI();
		Stack_Class st = new Stack_Class();
		StackI st1 = new StackI() {

			@Override
			public void push(int item) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public int peek() {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		
	}

}
