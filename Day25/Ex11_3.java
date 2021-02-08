package Day25;

import javax.swing.*;
import java.awt.*;

public class Ex11_3 extends JFrame {
	public Ex11_3() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");
		
		JButton btn = new JButton("call", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		
		cp.add(btn);
		
		setBounds(750,450,250,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex11_3();
	}

}
