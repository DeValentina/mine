package ch07;

public class Radio {
		double channel;
		int volume;
		boolean onOff;
		

void print() {
	
	System.out.println("채널은 "+channel+"이고 볼륨은 "+volume+"입니다.");
}
	double getChannel() {
	return channel;
	}
	void setChannel(int ch) {
		channel = ch;
		
	}
}

