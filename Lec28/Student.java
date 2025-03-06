package Lec28;

public class Student {

	String name;
	int age;

	public void Intro_yourSelf() {

		System.out.println("My Name is " + name + " and age is " + age);

	}
	public void SayHey(String name) {
		System.out.println(this.name+ " Say Hey "+name);
	}

}
