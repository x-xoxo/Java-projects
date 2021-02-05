package Day24;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class KeyCodeEx extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2381245217308443170L;
	private JLabel la = new JLabel();
	
	public KeyCodeEx()
	{
		setTitle("Key Code 예제 : F1키:초록색, %키:노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300,150);
		setVisible(true);
		
		// 컨탠트팬이 키 입력을 받을 수 있도록 포커스 강제 지정
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Container contentPane = (Container)e.getSource();
			la.setText(KeyEvent.getKeyText(e.getKeyCode())+"키가 입력되었음");
			if(e.getKeyChar() == '%')
				contentPane.setBackground(Color.YELLOW);
			else if (e.getKeyCode() == KeyEvent.VK_F1)
				contentPane.setBackground(Color.GREEN);
		}
	}

	public static void main(String[] args) {
		new KeyCodeEx();
	}

}
