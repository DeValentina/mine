package ch17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutEx2 extends JFrame{
	JPanel jp; //패널 변수 선언
	JButton jb1, jb2, jb3, jb4, jb5, jb6; //버튼변수 선언
	public FlowLayoutEx2() {
		super("flowLayout 예제2");
		jp = new JPanel(); //패널 생성
		jb1 = new JButton("버튼 1"); 
		jb2 = new JButton("버튼 2"); 
		jb3 = new JButton("버튼 3"); 
		jb4 = new JButton("버튼 4"); 
		jb5 = new JButton("버튼 5"); 
		jb6 = new JButton("버튼 6"); 
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		
		jp.setLayout(new FlowLayout());
		add(jp);
//		add(jp, "South");
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	public static void main(String[] args) {
		new FlowLayoutEx2();
		
	}
}
