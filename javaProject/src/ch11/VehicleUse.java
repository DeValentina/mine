package ch11;

public class VehicleUse {
	public static void main(String[] args) {
		Vehicle c = new Car();
		c.speedUp();
		c.speedDown();
		c.handle();
		
		c = new Plane();
		c.speedUp();
		c.speedDown();
		c.handle();
		
		c = new Boat();
		c.speedUp();
		c.speedDown();
		c.handle();
		
		
	}
}
