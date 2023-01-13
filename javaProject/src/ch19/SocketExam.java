package ch19;

import java.net.ServerSocket;

//서버소켓 : 서버에서 서비스르 위한 목적으로 만드는 소켓
//소켓 : 일반클라이언트 사용되는 소켓
//포트번호 : 0~65535 내에서 배정 가능, 중복 불가능 > 충돌
//1port 1service 일대일
//well known port number(자주 사용되어지는 포트 번호)
//80 : 웹서비스, 21:FTP서비스, 445:파일공유, 3389:원격접속..
//위에 포트들은 웬만해선 피하는게 좋음

public class SocketExam {
	public static void main(String[] args) {	
		ServerSocket socket=null;
		for(int i=0; i<=65535; i++) {
			try {
				socket = new ServerSocket(i); //서버소켓생성
				socket.close(); //소켓 서비스 종료
			} catch (Exception e) {
				System.out.println(i+"번 포트는 사용중입니다.");
			}
		}System.out.println("포트 검사를 마쳤습니다.");
	}
}
