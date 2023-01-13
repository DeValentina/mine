package ch17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame {
	private JMenuItem mie = new JMenuItem();
	public MenuEx() {
		super("Menu 예제");
		createMenu();
		setSize(300, 200);
		setVisible(true);
	};
	void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu jm = new JMenu("File");//메뉴 생성
		jm.add(new JMenuItem("Open"));//메뉴에 메뉴아이템 추가
		jm.add(new JMenuItem("Save"));//메뉴에 메뉴아이템 추가
		jm.add(new JMenuItem("Print"));//메뉴에 메뉴아이템 추가
		jm.addSeparator(); //구분선, 분리선 추가
		jm.add(mie);
		mb.add(jm);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		//프레임에 메뉴바 추가(메뉴바는 프레임에만 붙일 수 있다)
		setJMenuBar(mb);
		mie.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new MenuEx();
	}
}

