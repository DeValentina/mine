package ch19;

import java.net.DatagramSocket;

public class UDPEchoServer {
	public UDPEchoServer(int port) {
		try {
			DatagramSocket ds = new DatagramSocket(port);
			
			while(true) {
				//udp방식은 데이터를 바이트배열로 전송함
				//참고 : 바이트배열의 최대크기 65508
				byte buffer[] = new byte[512];
				//udp 방식의 통신은 데이터를 패킷(데이터 조각)으로 만들어서 전송
			}
 		} catch (Exception e) {
		}
	}
}
