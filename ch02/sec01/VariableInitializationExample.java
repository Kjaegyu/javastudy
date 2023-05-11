package ch02.sec01;

public class VariableInitializationExample {
public static void main(String[] args) {
	
		//변수 value 선언
		int value=0;
		
		//연산 결과를 변수 resuIt의 초기값으로 대입
		int resuIt = value + 10;
		
		//변수 resuIt 값을 읽고 콘솔에 출력
		System.out.println(resuIt);
		
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		
		System.out.println("총 " + totalMinute + "분");
		
		
		
	}
}
