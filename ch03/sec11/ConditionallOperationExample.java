package ch03.sec11;

import java.util.Scanner;

public class ConditionallOperationExample {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);

		

		while(true) {
			System.out.print("학점을 입력하세요"); 
			String tmp = scan.nextLine();
			
			if( tmp.equals("q")||tmp.equals("Q")){
				System.out.println("종료합니다");
				break;}
			else  {
				int s = Integer.parseInt(tmp);
			if( s>=90 ) {
				System.out.println("A");
			}else if (s>=80) {
				System.out.println("B");
			}else if (s>=70) {
				System.out.println("C");
			}else if (s>=60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}
	}
		}		
	}

				

		
		
		
	
	
	
		



