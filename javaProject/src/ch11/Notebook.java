package ch11;

public class Notebook implements Controllable {
	public static void main(String[] args) {
		Notebook nt=new Notebook();
		nt.turnOn();
		nt.turnOff();
		nt.repair();
		Controllable.reset();
		
		
	}

	@Override
	public void turnOn() {
		System.out.println("노트북을 켠다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("노트북을 끈다.");
		
	}
}
