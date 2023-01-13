package ch09;

public class Area {
	//멤버변수
	private int width;//width=0 기본초기화
	private int length;
	//생성자
	
	public Area() { } 
	public Area(int width, int length) {
		this.width = width;
		this.length = length;
	}


	//메소드
	public int getArea() {
		return width * length;
	}
	
}
