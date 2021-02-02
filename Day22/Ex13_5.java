package Day22;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex13_5 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3027430760506962554L;
	private Thread th;
	public Ex13_5() {
		setTitle("ThreadInterruptEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		//타이머값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		
		//타이머 스레드로 사용할 Runnable 객체 생성
		//타이머값을 출력할 레이블 컴포넌트를 생성자에 전달한다.
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable); // 스레드 생성
		c.add(timerLabel);
		
		// 버튼을 생성하고 Action 리스너 등록
		JButton btn = new JButton("Kill Timer");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			th.interrupt();
			JButton btn = (JButton)e.getSource();
			btn.setEnabled(false);
			}
		});
		c.add(btn);
		
		setSize(300,170);
		setVisible(true);
		
		th.start(); // 스레드 시작시킴
	}
	
	public static void main(String[] args) {
		new Ex13_5();
	}

}
class TimerRunnable implements Runnable {
	private JLabel timerLabel;
	public TimerRunnable(JLabel timerLabel)
	{
		this.timerLabel = timerLabel;
	}
	@Override
	public void run() {
		int n=0;
		while(true)
		{
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
		
	}
}