package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;

public class KeyMouseExam extends JApplet 
implements MouseListener, MouseMotionListener, KeyListener {
//mouselistener: 마우스이벤트 처리를 위한 인터페이스
//mousemotionlistener:마웃 이동 이벤트 처리를 위한 인터페이스
//keylistener : 키보드이벤트 처리를 위한 인터페이스	
	private int x,y; //이미지를 출력할 x,y 좌표값
	private int width, height; //이미지 가로,세로 사이즈
	private Image img; //이미지를 다룰 객체
	private boolean flag = false;//이미지가 처음 실행할땐 안보이게 false로 씀
	
	@Override
		public void init() {
		setSize(300, 300);//화면 사이즈
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		this.addMouseListener(this);//현재 클래스에 마우스 이벤트 기능 추가*중요코드)
		this.addMouseMotionListener(this);
		setFocusable(true);
		requestFocus();
	}
	@Override
		public void paint(Graphics g) {
			super.paint(g);
			//이미지의 가로,세로 길이 계산
			width = img.getWidth(null);
			height = img.getHeight(null);
			System.out.println("width+","+heigth");
			if(flag) {
				g.drawImage(img, x, y, x, y, x, y, x, y, rootPane)
			}
		}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//키가 눌려져 있을때 호출
		System.out.println(e.getKeyCode());//키 코드값
		System.out.println(e.getKeyChar());//키 문자값
		switch (e.getKeyCode()) { //키코드값 따라 분기
		//이미지가 프레임 바깥으로 빠져나가지 않게 처리함.
		case KeyEvent.VK_UP://커서 윗키 눌렀을때
			y = Math.max(0, y-5); break;
		case KeyEvent.VK_DOWN://아랫키
			y=Math.min(300-height, y+5); break;
		case KeyEvent.VK_LEFT://왼쪽 키를 눌렀을때
			x=Math.max(0, x-5); break;
		case KeyEvent.VK_RIGHT: //오른쪽 키를 눌렀을때
			x=Math.min(300-width, x+5); break; //300-300(메인) 안에 들어와야함
			
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		//마우스를 드래그할때 호출
		System.out.println("mouse drag : x"+x+", y:"+y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//마우스가 이동했지만 버튼이 작동않는 경우에 호출
		x = e.getX();
		y = e.getY();
		System.out.println("mouse move: x:"+x+", y :"+y);
	}

	//컴퍼넌트상에서 마우스 버튼을 클릭(눌렀다 놓을때)했을때 호출
	@Override
	public void mouseClicked(MouseEvent e) {
		flag = true;//클릭할때 그림 true로 설정해서 보여지게 함
		x = e.getX();
		y = e.getY();
		repaint(); //그래픽 갱신 요청 > paint가 호출됨
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//컴퍼넌트 상에서 마우스 버튼을 누르는 시점 때에 호출
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//마우스 떼어 놓아질때 호출
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//마우스가 해당 컴퍼넌트에 진입할때 호출
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//마우스가 컴퍼넌트 종료하면 호출
	}
	
}
