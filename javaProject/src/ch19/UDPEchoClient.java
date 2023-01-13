package ch19;

import java.io.BufferedReader;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoClient {
	private String str;
	private BufferedReader file;
	private static int SERVERPORT = 3000; //서버측 포트번호 세팅
	public UDPEchoClient(String ip, int port) {
		try {
			InetAddress ia = InetAddress.getByName(ip);
			DatagramSocket
		}
	}
	

	
	
	
	public static void main(String[] args) {
		new UDPEchoClient("localhost", 2000);
		//클라이언트 ip, 클라이언트 포트번호
		//UDP 클라이언트 포트번호와 서버측 포트번호 달라야한다
	}
}
