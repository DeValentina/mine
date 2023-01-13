package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam extends JFrame{
	public PanelExam() {
//	패널에는 2개 이상의 컴포넌트를 배치할 수 있기 때문에 버튼을 패널에 추가 후
// 패널을 프레임에 붙여 여러개의 컴포넌트 처리할 수 있다
		JPanel p = new JPanel(); //패널 생성
		p.setBackground(Color.red);//패널의 배경색상 설정
		//버튼 생성(swing은 한글처리가 잘된다.)
		JButton button1 = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		JButton button3 = new JButton("버튼3");
		JButton button4 = new JButton("버튼4");
		JButton button5 = new JButton("버튼5");
		JButton button6 = new JButton("버튼6");
		//모두가 아니고 패널. 패널에 버튼 추가
		p.add(button1);
		p.add(button6);
		//패널 보더레이아웃의 북쪽영역에 추가
		add(p, "North");
//		add(p, BorderLayout.NORTH); 위아래 같은 것
		
		//버튼을 보더레이아웃의 각 영역에 추가
		add(button2);
		add(button3, "South");
		add(button4, "West");
		add(button5, "East");
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new PanelExam();
	}
}
