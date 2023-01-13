package ch02;

public class Box {
	public static void main(String[] args) {
		double width;
		double length;
		double perimeter;
		double area;
		
		width = 10.0;
		length = 5.0;
		
		area = width * length;
		perimeter = 2.0 * (width + length);
		System.out.println("사각형의 넓이 : " + area);
		System.out.println("사각형의 둘레 : " + perimeter);
	}

}
