package Day24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerEx extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6535607073049755241L;
	private JLabel KeyMessage[];
	public KeyListenerEx() {
		setTitle("keyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		// 레이블 배열을 3개 생성하고 각 레이블 컴포넌트 생성
		KeyMessage = new JLabel[3];
		KeyMessage[0] = new JLabel(" getKeyCode()  ");
		KeyMessage[1] = new JLabel(" getKeyChar()  ");
		KeyMessage[2] = new JLabel(" getKeyText()  ");
		// 3개의 레이블 컴포넌트를 컨텐트팬에 부착
		for(int i=0;i<KeyMessage.length;i++)
		{
			c.add(KeyMessage[i]);
			KeyMessage[i].setOpaque(true);
			KeyMessage[i].setBackground(Color.YELLOW);
		}
		setSize(300,150);
		setVisible(true);
		
		// 컨탠트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		c.setFocusable(true);
		c.requestFocus();
		
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e)
		{
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			KeyMessage[0].setText(Integer.toString(keyCode));
			KeyMessage[1].setText(Character.toString(keyChar));
			KeyMessage[2].setText(KeyEvent.getKeyText(keyCode));
			
			System.out.println("KeyPressed");
		}
		public void keyReleased(KeyEvent e)
		{
			System.out.println("KeyReleased");
		}
		public void keyTyped(KeyEvent e)
		{
			System.out.println("KeyTyped");
		}
	}

	public static void main(String[] args) {
		new KeyListenerEx();
	}

}
