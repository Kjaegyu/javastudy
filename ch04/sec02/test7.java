package ch04.sec02;

import java.util.Scanner;

public class test7 {



// k번째 약수 구하기
public static int function (int number, int k) {
	for (int i = 1; i <= number; i++) {
		if(number % i == 0) {
			k--;
			if(k == 0) {
				return i;
				
			}
		}
	}
	return -1;
}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.print("약수를 구할 대상의 정수를 입력하세요 : ");
		int x = sc.nextInt();
		System.out.print("몇번째 약수를 구할 것인지 입력하세요 : ");
		int y = sc.nextInt();
		
		int result = function (x, y);
		if (result == -1) {
			System.out.println("해당 정수의 10번째 약수는 없습니다.");
		} else System.out.println(result);
		
	}
}
