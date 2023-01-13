package ch07;

public class TelevisionTest3 {
	public static void main(String[] args) {
		Television myTv = new Television();
		//객체생성
		myTv.channel=7;
		myTv.volume = 9;
		myTv.onOff = true;
		
		//객체 생성 -> 아예 다른 객체임
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
	}
}
