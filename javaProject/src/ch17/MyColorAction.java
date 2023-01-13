package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyColorAction implements ActionListener {
	private JFrame f;
	private Color c;
	private Container con;
	//container:다른 컴퍼넌트 담을 수 있는 요소
	//component : 화면 구성 요소(프레임,버튼,패널)...
	//contentpane : 스윙에서는 contentpane에 컴포넌트를 부착할 수 있는데 contentpane은
	//jframe객체가 처음 생길때 자동으로 생성되며, getcontentpane(메소드로 사용해 얻을 수 있다
	
	public MyColorAction(JFrame f, Color c) {
		this.f=f;
		con=f.getContentPane();//프레임 컨텐츠 영역으로 활용
		this.c=c;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);//배경색상 변경
	}
	
}
