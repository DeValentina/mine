package ch12;

interface RemoteControl {//인터페이스는 인스턴스화 불가능
	void turnOn();
	void turnOff();
	
}




public class AnnoymousClassTest {
	public static void main(String[] args) {
		RemoteControl ac = new RemoteControl() {
			//ㄴ interface를 new로 객체처럼 쓰는거 아닌가요?
			//아님 무명클래스 처리하면 인터페이스를 무명 클래스가 상속받아 오버라이딩
			//{} 코드블록 자체가 자식 역할 중(익명클래스가)
			
			@Override
			public void turnOn() {
				System.out.println("TV turnOn()");
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV turnOff()");	
			}
		};//세미콜론 > 무명내부클래스
		ac.turnOn();
		ac.turnOff();
	}
}
