package ch10;

class Triangle extends Figure {
	@override
	void draw() {
		System.out.println("삼각형 그리기...");
	}
}
class Rectangle extends Figure {
	@override
	void draw() {
		System.out.println("사각형 그리기...");
	}
}

class Circle extends Figure {
	@override
	void draw() {
		System.out.println("원 그리기...");
	}
}

class Circle
public class Figure {
	void draw() {
		System.out.println("도형을 그립니다.");
	}
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.draw();
		Rectangle r = new Rectangle();
		r.draw();
		Circle c= new Circle();
		c.draw();
		
		Figure f = new Triangle();
		//자식 클래스 오른쪽에 좌 : 부, 우:자 > 다형성 기법
		
	}
}
