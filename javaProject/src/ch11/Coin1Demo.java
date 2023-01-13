package ch11;

public class Coin1Demo {
	public static void main(String[] args) {
		//interface는 객체 안된다고 했는데?
		//=> "static"에 올라가기 때문에 
		//인터페이스 상수는 static영역에 있기 때문에 클래스이름.상수이름으로 접근 가능
		System.out.println("Dime은 "+Coin.DIME+"센트입니다.");
		System.out.println("Dime은 "+Coin.DIME+"센트입니다.");
		System.out.println("Nickel은 "+Coin.NICKEL+"센트입니다.");
	}
}
