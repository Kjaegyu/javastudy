package ch11.sec02.exam01;

public class ExceptionHandlingExmple1 {

	public static void printLength (String data) {
		int result = data.length();
		System.out.println("문자 수: " + result);
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램시작]\n");
		printLength("Thisisjava");
		printLength(null);
		System.out.println("[프로그램 종료}");

	}

}
