package ch07;

public class Television {
	//멤버변수(전역변수)
	int channel;//channel=0
	int volume;
	boolean onOff;//전원상태
	
	
	void print() {// 메소드 => television의 멤버메소드
		//class 밑 모두가 멤버변수
		
		System.out.println("채널은 "+channel+"이고 볼륨은 "+volume+"입니다.");
	}
		int getChannel() {
		return channel;
		}
		void setChannel(int ch) {
			channel = ch;
			
		
	}
	
}
