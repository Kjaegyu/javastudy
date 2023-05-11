package ch04.sec06;

import java.util.Scanner;

public class DowhileExample {
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scan =new Scanner(System.in);	 //scanner 생성 
		String inqutString;
		int speed = 0;
		do {
			System.out.println(">");
			inqutString = scan.nextLine(); 	//키보드로부터 읽기
			System.out.println(inqutString);
		} while ( ! inqutString.equals("q") );
		
		System.out.println();
		System.out.println("프로그램 종료");
		}
		
	}

