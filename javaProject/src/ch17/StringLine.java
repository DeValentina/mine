package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;
//japplet은 applet의 확장판으로 애플릿뷰어나 웹르라우저와 함께 쓰이며
//게임 및 다양한 그래픽을 구사할 수 있음
//html5 웹진화하면서 거의 사라짐
//라이프사이클 가지고 있따. init - start-stop-destroy
//init은 필수처리이며 나머지는 차동으로 처리되며
//특정 웹브라우저 페이지 이동 강제 종료 시킬때 쓰임

public class StringLine extends JApplet{
	@Override
	public void init() {//애플릿을 초기화하는 코드
		getContentPane().setBackground(new Color(255,255,255));//배경색상 설정
		setSize(300, 300);//애플릿의 화면 사이즈
		
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);//색상 설정
		g.drawLine(205, 50, 30, 160);
		//선그리기 drawline x1, y1, x2, y2
		g.setColor(Color.red);
		g.drawString("Red String", 10, 50);
		g.setColor(Color.green);
		g.drawString("Green String", 10, 80);
		g.setColor(Color.blue);
		g.drawString("Blue String", 10, 110);
	}
}
