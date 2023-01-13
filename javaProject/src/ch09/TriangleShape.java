package ch09;

public class TriangleShape {
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
	public TriangleShape (int width, int height) {
		super("Triangle");
		this.width = width;
		this.height = height;
	}
	@Override
	public double calculateArea() {
		return width * (heigth*0.5);
		
	}
	}
