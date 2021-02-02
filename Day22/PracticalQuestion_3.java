package Day22;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PracticalQuestion_3 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 810906782532021762L;

	public PracticalQuestion_3() {
		setTitle("Calendar를 이용한 현재시각출력 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 48));
		c.add(timerLabel);
		JLabel showStudy = new JLabel();
		showStudy.setFont(new Font("Gothic", Font.ITALIC, 24));
		showStudy.setForeground(Color.MAGENTA);
		c.add(showStudy);
		TimerCal runnable = new TimerCal(timerLabel);
		Thread th = new Thread(runnable);
		ShowTimeToStudy show = new ShowTimeToStudy(showStudy);
		Thread th1 = new Thread(show);
		setSize(250, 150);
		setVisible(true);

		th.start();
		th1.start();
	}

	public static void main(String[] args) {
		new PracticalQuestion_3();
	}

}

class ShowTimeToStudy implements Runnable {
	private JLabel timerLabel;

	public ShowTimeToStudy(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {

		while (true) {
			Calendar c = Calendar.getInstance();
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int min = c.get(Calendar.MINUTE);
			if (hour < 12) {
				if (min >= 50 && min <= 59)
					timerLabel.setText("쉬는 시간입니다.");
				else
					timerLabel.setText("공부 시간입니다.");
			} else {
				if (min >= 40 && min <= 49)
					timerLabel.setText("쉬는 시간입니다.");
				else
					timerLabel.setText("공부 시간입니다.");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

class TimerCal implements Runnable {
	private JLabel timerLabel;

	public TimerCal(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {

		while (true) {
			Calendar c = Calendar.getInstance();
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int min = c.get(Calendar.MINUTE);
			int sec = c.get(Calendar.SECOND);
			String clockText = hour + ":" + min + ":" + sec;
			timerLabel.setText(clockText);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}
}