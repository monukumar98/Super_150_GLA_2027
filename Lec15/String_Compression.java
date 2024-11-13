package Lec15;

public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "kunal";
		String s2 = "komal";
//		System.out.println(s1.compareTo(s2));
//		String s3 = "ankit";
//		String s4 = "ankita";
//		System.out.println(s3.compareTo(s4));
		System.out.println(compareTo(s1, s2));

	}

	public static int compareTo(String s1, String s2) {
		if (s1 == s2) {
			return 0;
		}
		int n =Math.min(s1.length(), s2.length());
		for (int i = 0; i <n; i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		return s1.length()-s2.length();
				

	}
}
















