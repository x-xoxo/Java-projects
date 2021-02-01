package Day21;

import javax.swing.*;
import java.awt.*;

public class Ex13_1 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1798940272599458105L;

	public Ex13_1() {
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);

		TimerThreads th = new TimerThreads(timerLabel);

		setSize(300, 170);
		setVisible(true);

		th.start();
	}

	public static void main(String[] args) {
		new Ex13_1();
	}

}

class TimerThreads extends Thread {
	private JLabel timerLable;

	public TimerThreads(JLabel timerLabel) {
		this.timerLable = timerLabel;
	}

	@Override
	public void run() {
		int n = 0;
		while (true) {
			timerLable.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}
}