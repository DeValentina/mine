package ch07;


/*한개의 파일에 2개이상의 class작성할때는 main메소드가 있는 
public class를 클래스이름으로 저장해야함*/

 class Phone {
	String model;
	int value;
	void print() {
		System.out.println(value+"만원 짜리"+model+"스마트폰");
	}
}

public class PhoneDemo {//실행파일
	public static void main(String[] args) {
		Phone myPhone= new Phone();
		//객체 생성 -> 다음과 다른 곳에서 처리 중임
		myPhone.model ="갤럭시 S11";
		myPhone.value =100;
		myPhone.print();
		
		Phone yourPhone new Phone();
		//객체 생성 -> 처음과 다른 곳에서 처리 중임
		yourPhone.model ="갤럭시 S11";
		yourPhone.value =100;
		yourPhone.print();
		
	}
	
}
