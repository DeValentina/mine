package ch19;

import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiChatClient {
	static String nickName = null; //대화명
	static JTextArea ta;
	static JTextField tf;
	static DataOutputStream out;
	
	public static void main(String[] args) {
		nickName = JOptionPane.showInputDialog("대화명을 입력하세요");
		
		Socket socket;
		try {
			String serverIp = "localhost";
			socket = new Socket(serverIp, 7777);
			System.out.println("서버에 연결되었습니다.");
			Thread receiveThread = new Clientrece
		} catch (Exception e) {
			
			
		}
	}
}
