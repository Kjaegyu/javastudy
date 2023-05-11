package ch04.sec02;

import java.util.Scanner;

public class test5 {

	public static int Maxfunction(int a , int b) {
		int x = Math.max(a, b);
		return x;
	}
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("2개의 정수를 입력하세요 : ");
	int num = sc.nextInt();
	int num2 = sc.nextInt();
	System.out.println(Maxfunction(num, num2));
	
					
		}
	}



