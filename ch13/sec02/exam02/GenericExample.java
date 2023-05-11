package ch13.sec02.exam02;

public class GenericExample {

	public static void main(String[] args) {
		HomeAgency HomeAgency = new HomeAgency();
		Home home = HomeAgency.rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
	}

}
