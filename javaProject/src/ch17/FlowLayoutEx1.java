package ch17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx1 extends JFrame{
	public FlowLayoutEx1() {
		setTitle("FlowLayout 예제");
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		//flowlayout설정
		setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 40));//jframe>flow바뀜
		//flowlayout.정렬위치, 컴포넌트간 좌우간격 30, 상하 40픽셀
		//setLayout(new FlowLayout());//jframe>flow바뀜
		
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new JButton("5"));
	}
	public static void main(String[] args) {
		new FlowLayoutEx1();
	}
	//flow: 사이즈 맞춰 자동으로 맞춤
}
