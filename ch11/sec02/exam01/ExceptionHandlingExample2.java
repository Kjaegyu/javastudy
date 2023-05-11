package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {

	public static void printLength (String data) {
		try {
		int result = data.length();
		System.out.println("문자 수: " + result);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage()); 
				
				//System.out.println(e.toString));
				//eprintStackTrace();
			} finally {
				System.out.println("[마무리 실행]\n");
				
			}
		}
	public static void main(String[] args) {
		System.out.println("[프로그램시작]\n");
		printLength("Thisisjava");
		printLength(null);
		System.out.println("[프로그램 종료}");

	}

}
