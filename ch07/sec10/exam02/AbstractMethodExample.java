package ch07.sec10.exam02;

public class AbstractMethodExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		//매개변수의 다향성
		animalsound(new Dog());
		animalsound(new Cat());
		
	}
	
	public static void animalsound(Animal animal ) {
		animal.sound();
	}
	
}
