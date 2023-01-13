package ch09;

public class Volume extends Area{
	//멤버변수
	private int height;
	public Volume() { }
	public Volume(int width, int length, int height) {//10 20 30 
		super(width,length);//부모생성자 호출
		this.height = height;
	}
	//메소드
	public int getVolume() {
		return getArea() * height;
				
	}
	

}
