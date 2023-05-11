package ch13.sec01;

public class GenericExample {
	public static void main(String[] args) {
		//box<String> box1 = new box<>(String>();
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요.";
		String str = box1.content;
		System.out.println(str);
		
		//box<integer> box2 = new box(integer)();
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
	}
}