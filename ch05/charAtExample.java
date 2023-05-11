package ch05;

public class charAtExample {

	public static void main(String[] args) {
		// 문자열 수출
	String ssn ="9506241230123";
	char sex = ssn.charAt(6);
	switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
	}
	

	}

}
