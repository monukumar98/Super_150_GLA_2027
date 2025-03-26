package Lec32;

public class Student {

	String name;
	int age;

	public void Intro_yourSelf() {

		System.out.println("My Name is " + name + " and age is " + age);

	}
	public static void MentorName() {
		
	}

	public void SayHey(String name) {
		System.out.println(this.name + " Say Hey " + name);
	}

	static {
		System.out.println("I am in Student ");
	}
	
	static {
		System.out.println("I am in Student 2 ");
	}

}
