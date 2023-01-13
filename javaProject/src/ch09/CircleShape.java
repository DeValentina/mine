package ch09;

public class CircleShape extends Shape{
	private int radius;
	//getter,setter

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public CircleShape(int radius) {
		return radius * radius * Math.PI;
	}
	
	
	
 }
