package ch07;

public class RadioTest {
	public static void main(String[] args) {
		Radio BritzRd = new Radio(); 
		BritzRd.channel = 89.1;
		BritzRd.volume = 12;
		BritzRd.onOff = true;
		System.out.println("[브리츠 라디오]");
		System.out.println(BritzRd.onOff ? "라디오가 켜져있습니다." : "라디오가 꺼져있습니다.");
		System.out.println("현재 채널은 "+BritzRd.channel+"입니다.");
		System.out.println("볼륨은 "+BritzRd.volume+"입니다.");

		
		Radio RiverRd = new Radio();
		RiverRd.channel = 95.1;
		RiverRd.volume = 9;
		RiverRd.onOff = false;
		System.out.println("");
		System.out.println("[아이리버 라디오]");
		System.out.println(RiverRd.onOff ? "라디오가 켜져있습니다." : "라디오가 꺼져있습니다.");
		System.out.println("현재 채널은 "+RiverRd.channel+"입니다.");
		System.out.println("볼륨은 "+RiverRd.volume+"입니다.");

	}

}
