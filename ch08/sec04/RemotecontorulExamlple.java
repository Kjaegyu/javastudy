package ch08.sec04;

public class RemotecontorulExamlple {

	public static void main(String[] args) {
		//인터페이스 변수 선언
		RemoteControl rc;
		
		
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
				

	}

}
