package ch11;

public class ControllableDemo {
	public static void main(String[] args) {
		TV tv=new TV();
		tv.turnOn();
		tv.turnOff();
		tv.remoteOn();
		tv.remoteOff();
		tv.repair();
		Controllable.reset();
		//static메소드는 클래스.메소드로 접근가능
		
		Computer com=new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();
		
	}
}
