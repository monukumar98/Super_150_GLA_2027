package Lec34;

public class Abstract_Demo_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Abstract_Demo ab = new Abstract_Demo();
//		ab.PayOnline();
		Abstract_Demo ab = new Abstract_Demo2();
		ab.PayOnline();
		Abstract_Demo ab1 = new Abstract_Demo() {

			@Override
			public void PayOnline() {
				// TODO Auto-generated method stub
				
			}
			
		};
		Abstract_Demo ab2 = new Abstract_Demo() {
			
			@Override
			public void PayOnline() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

}
