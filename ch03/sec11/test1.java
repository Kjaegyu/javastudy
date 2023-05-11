package ch03.sec11;

public class test1 {

	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
	}
}
