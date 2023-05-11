package ch05.sec11;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
			}
		

	String strNum1 = args[0];
	String strNum2 = args[1];
	String strNum3 = args[2];
	
	int num1 = Integer.parseInt(strNum1);
	int num2 = Integer.parseInt(strNum2);
	int num3 = Integer.parseInt(strNum3);
	
	
	int result = num1 + num2 + num3;
	
		System.out.println(num1 + " + " +num2 + " + " + num3 + " = " + result);
		

	}
}
