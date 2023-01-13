package ch09;

public class RectangleShape extends Shape {
	private int width;
	private int height;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return (double)width * height;
	}

	@Override
	public void draw() {
		
		super.draw();
	}
	
}
