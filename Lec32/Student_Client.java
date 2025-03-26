package Lec32;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		Student s = new Student();
		s.name = "Kaju";
		s.age = 21;
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "Ankit";
		s1.age = 22;
		s1.Intro_yourSelf();
		s1.SayHey("PCR");
	}

	static {
		System.out.println("I am in Student_Client ");
	}

}
