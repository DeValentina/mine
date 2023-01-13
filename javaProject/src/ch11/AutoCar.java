package ch11;

public class AutoCar implements OperateCar{
	
	@Override
	public void stop() {
		System.out.println("자동차가 정지합니다.");
	}
}
