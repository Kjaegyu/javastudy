package ch11.sec02.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.string");
			System.out.println("java.lang.String 클래스가 존재합니다");
		} catch (ClassNotFoundException e)  {
			e.printStackTrace();
		}

		System.out.println();
		
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String2 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
