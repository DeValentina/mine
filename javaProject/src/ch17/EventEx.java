package ch17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//이벤트 처리 3대 요소
//1)이벤트 소스 2)이벤트 처리기(class) 3)리스너
public class EventEx extends Frame implements WindowListener {
	public EventEx() {
		addWindowListener(this);
		//(new...) 쓰지 않고 WindowListener상속받아 쓰면(this)로 사용가능
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new EventEx();
	}
	@Override
	public void windowOpened(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}

}
