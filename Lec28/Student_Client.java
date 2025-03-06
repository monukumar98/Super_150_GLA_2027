package Lec28;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.name = "Kamlesh";
		s.age = 16;
		s.Intro_yourSelf();
		Student s1 = new Student();
		s1.name = "Kaju";
		s1.age = 22;
		s1.Intro_yourSelf();
		s.SayHey("Raj");
	}

}
