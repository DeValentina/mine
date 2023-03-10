package ch17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame {
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(6, 20);
	//6행 20열의 입력창 생성
	public TextAreaEx() {
		super("TextArea 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
		c.add(tf);
		c.add(new JScrollPane(ta));//textarea는 스크롤패널 함께 써야함
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				//object타입이 더 크니까(source) 좌/우 타입 다를때 꼭 맞춰주기
				ta.append(t.getText()+"\n");
				//텍스트필드의 문자열을 textarea영역으로 옮김
				t.setText("");
				//현재 텍스트 필드ㅔㅇ 입력된 내용을 지우기
			}
		});
		setSize(250, 200);
		setVisible(true);
	}
		
	
			
		}

