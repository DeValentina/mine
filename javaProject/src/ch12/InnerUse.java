package ch12;

import ch11.Flyer;

public class InnerUse {
	public static void main(String[] args) {
		Flyer f =new Flyer() {//new 생성자() { } ; > 무명클래스
			
			@Override
			public void takeOff() {
				System.out.println("take off");
			}
			
			@Override
			public void land() {
				System.out.println("land");
				
			}
			
			@Override
			public void fly() {
				System.out.println("fly");
				
			}
		};//무명클래스
		f.takeOff();
		f.fly();
		f.land();
		//호출 순서에 따라 출력됨
	}
}

