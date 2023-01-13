package ch09;

class Bank {
	double getInterestRate() {
		//bank의 멤버메소드
		return 0.0;
		
	}
}
class BadBank extends Bank {
	//@ : 어노테이션 annotation 라고 컴파일러에게 추가적 정보 제공
	// 어노테이션 : 주석 정도로 이해해둘것 우선은
	@Override
	double getInterestRate() {
		//메소드 오버라이딩(재정의)
//		return super.getInterestRate();
		return 10.0;
	}
		
}

class NormalBank extends Bank {
	@Override
	double getInterestRate() {
		return 5.0;
		
	}
}

class GoodBank extends Bank {
	@Override
	double getInterestRate() {
		return 3.0;
		
	}
}

public class BankTest {
	public static void main(String[] args) {
		BadBank b1 = new BadBank(); //객체생성
		NormalBank b2= new NormalBank();
		GoodBank b3= new GoodBank();
		System.out.println("BadBank의 이자율 : "+b1.getInterestRate());
		System.out.println("NormalBank의 이자율 : "+b2.getInterestRate());
		System.out.println("GoodBank의 이자율 : "+b3.getInterestRate());
	}
}
