package Lec18;

public class String_Builder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb.capacity());
		// add
		sb.append("jhhkkl");
		sb.append(true);
		sb.append(7);
		sb.append('a');
	//	sb.append(2,"jh");
		System.out.println(sb);
	
		System.out.println(sb.charAt(2));
		System.out.println(sb.reverse());
		System.out.println(sb.delete(1, 3));
		System.out.println(sb.substring(0, 4));
		sb.append("hhhhhh1");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
//		String s=sb.toString();
//		String str="dklljhgfdfghjhgjljkhgcbvh";
//		sb.append(str);
		

	}

}






