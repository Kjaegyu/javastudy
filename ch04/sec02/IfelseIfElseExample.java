package ch04.sec02;

import java.util.Scanner;

public class IfelseIfElseExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char hak = 'F';
		int num = 0, grade=0;
		String jumsu ="";
		
		
		
		while(true) {
			
				System.out.println("점수를 입력(종로Q) :");
				jumsu = scan.nextLine();
		
			if (jumsu.equals("Q"))
				break;
			
			
		 num = Integer.parseInt(jumsu);
		
		grade = num/10;
	 
		switch (grade) {
		case  9 :
			hak = 'A';
		break;
		case 8 :
			hak = 'B';
		break;
		case 7 :
			hak = 'C';
		break;
		case 6 :
			hak = 'B'; 
		break;
		default:
			hak = 'F';
			
		}
			System.out.println("당신의 점수는" + jumsu + "이고 학점은" + hak + "입니다.");
		
	 }
	}
}

