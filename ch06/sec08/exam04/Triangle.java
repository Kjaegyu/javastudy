package ch06.sec08.exam04;

public class Triangle {


double triHeight; // 삼각형의 높이
double triBottom; // 삼각형의 밑변
double triArea; // 삼각형의 넓이

public Triangle(double height, double bottom){
	triHeight = height;
	triBottom = bottom;
}

public void setTriBottom(double bottom){ triBottom = bottom; }
public void setTriHeight(double height){ triHeight = height; }

public double getArea(){
	return triHeight * triBottom / 2;
}
}

