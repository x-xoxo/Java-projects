package Day22;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex13_6 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6324365555656561205L;
	private RandomThread th;

	public Ex13_6() {
		setTitle("ThreadFinishFlagEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				th.finish();
			}
		});
		setSize(300, 200);
		setVisible(true);
		th = new RandomThread(c);
		th.start();
	}

	public static void main(String[] args) {
		new Ex13_6();
	}

}

class RandomThread extends Thread {
	private Container contentPane;
	private boolean flag = false;

	public RandomThread(Container contentPane) {
		this.contentPane = contentPane;
	}

	public void finish() {
		flag = true;
	}

	@Override
	public void run() {
		while (true) {
			int x = ((int) (Math.random() * contentPane.getWidth()));
			int y = ((int) (Math.random() * contentPane.getHeight()));
			JLabel label = new JLabel("Java");
			label.setSize(80, 30);
			label.setFont(new Font("Gothic", Font.ITALIC, 18));
			label.setLocation(x, y);
			contentPane.add(label);
			contentPane.repaint();
			try {
				Thread.sleep(300);
				if (flag == true) {
					contentPane.removeAll();
					label = new JLabel("Finish");
					label.setSize(80, 30);
					label.setFont(new Font("Gothic", Font.ITALIC, 18));
					label.setLocation(100, 100);
					label.setForeground(Color.RED);
					contentPane.add(label);
					contentPane.repaint(); // 컨텐트팬을 다시 그려 추가된 레이블 보이게 함
					return;
				}
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}