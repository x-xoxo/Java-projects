package Day21;

import java.awt.*;
import javax.swing.*;

public class Ex13_3 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2407460247224239610L;

	public Ex13_3() {
		setTitle("FlickeringLabelEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		FlickeringLabel fLabel = new FlickeringLabel("깜빡", 500);

		JLabel label = new JLabel("안깜빡");
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜빡", 300);

		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);

		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex13_3();
	}

}

class FlickeringLabel extends JLabel implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -396275599175447581L;
	private long delay;

	public FlickeringLabel(String text, long delay) {
		super(text);
		this.delay = delay;
		setOpaque(true);
		Thread th = new Thread(this);
		th.start();
	}

	@Override
	public void run() {
		int n = 0;
		while (true) {
			if (n == 0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if (n == 0)
				n = 1;
			else
				n = 0;
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}
}