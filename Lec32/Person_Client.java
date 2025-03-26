package Lec32;

public class Person_Client {

	public static void main(String[] args) {// throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		Person p = new Person("kunal", 28);
		Person p1 = new Person("Ankita", 128);
//		System.out.println(p.age);
//		System.out.println(p.name);
//		p.age = 99;
		p1.setAge(-18);
		System.out.println(p1.getAge());
		System.out.println("Bye");
	}

}
