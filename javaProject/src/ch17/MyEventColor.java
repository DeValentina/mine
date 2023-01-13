package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyEventColor extends JFrame {
	private JButton button1,button2,button3,button4,button5;
	public MyEventColor() {
		//플로우 레이아웃 변경
		setLayout(new BorderLayout());
		button1 = new JButton("North");
		button2 = new JButton("East");
		button3 = new JButton("South");
		button4 = new JButton("West");
		
		
		add(button1, BorderLayout.NORTH); 
		add(button2, BorderLayout.EAST); 
		add(button3, BorderLayout.SOUTH);
		add(button4, BorderLayout.WEST);
		
		//버튼 클릭시 이벤트 기능 추가
		button1.addActionListener(new MyColorAction(this, Color.red));
		button2.addActionListener(new MyColorAction(this, Color.green));
		button3.addActionListener(new MyColorAction(this, Color.blue));
		button4.addActionListener(new MyColorAction(this, Color.yellow));
		//버튼을 누르면 MyColorAction 클래스에서 구현한 actionPerformed()가 자동 호출됨.
		//this는 EventEx2 자신의 객체를 가리키는 것. 
		//또 데이터타입으로는 JFrame타입이다.(JFrame을 상속받았기 때문)
		
		setSize(450, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//현재 창만 닫음
	}
	public static void main(String[] args) {
		new MyEventColor();
	}

}
