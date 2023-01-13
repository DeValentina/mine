package ch17;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridEx1 extends JFrame{
	public GridEx1() {
		super("GridLayout 예제");
		setLayout(new GridLayout(2,3));//2행 3열의 그리드레이아웃 설정
		JButton btn1 = new JButton("버튼 1");
		JButton btn2 = new JButton("버튼 2");
		JButton btn3 = new JButton("버튼 3");
		JButton btn4 = new JButton("버튼 4");
		JButton btn5 = new JButton("버튼 5");
		JButton btn6 = new JButton("버튼 6");
		
		//그리드 레이아웃에 버튼 추가
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GridEx1();
	}
}
