package ch12;

import java.awt.Frame;
//Ctrl Shft o
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class InnerExam extends Frame {
	public InnerExam() {
		super("내부 클래스 테스트");
		setSize(300,400); //프레임크기인 가로, 세로 초기사이즈 설정
		setVisible(true);
	}
	public static void main(String[] args) {
		InnerExam e = new InnerExam();
		//이벤트 처리 : 사용자의 요청(request)에 시스템 응답
		//이벤트 3대 요소
		//1)이벤트소스: 이벤트의 대상
		//2)이벤트 리스너:이벤트 관찰자, 감시자
		//3)이벤트 핸들러: 이벤트 처리 -ex)windowclose
		
//		e.addWindowListener(new WindowListener() {
//			//무명클래스
//			
//			@Override
//			public void windowOpened(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				
//				System.exit(0); //프로그램종료 코드
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//			
//				
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
			
		e.addWindowListener(new windowAdapter e) {
			@Override
			public 
		}
	}
}
