package ch06.sec08.exam04;

public class TriangleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			Triangle triangle1 = new Triangle(4.3, 7.5);
			System.out.println("첫 번째 삼각형");
			System.out.println("삼각형의 넓이 : " + triangle1.getArea());

			triangle1.setTriBottom(3.3);
			triangle1.setTriHeight(3.3);
			System.out.println("삼각형의 넓이 : " + triangle1.getArea());
			
		 }
		}
