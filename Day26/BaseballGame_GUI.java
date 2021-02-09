package Day26;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class BaseballGame_GUI extends JFrame {
	private ComRandomNum com;
	private JPanel inputPnl, outputPnl, strikePnl, ballPnl, outPnl;
	private JButton enterBtn;
	private JTextField tf;
	private ImageIcon gongImg = new ImageIcon("images\\ball.jpg");
	private JLabel strikeText, ballText, outText;
	private JLabel[] strikeCnt = new JLabel[2];
	private JLabel[] ballCnt = new JLabel[3];
	private JLabel outCnt = new JLabel(gongImg);

	public BaseballGame_GUI(ComRandomNum com) {
		super("숫자야구게임 GUI Ver");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.com = com;
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		inputPnl = new JPanel();
		tf = new JTextField(15);
		enterBtn = new JButton("Enter");
		enterBtn.addActionListener(new MyActionListener());
		inputPnl.add(tf);
		inputPnl.add(enterBtn);
		c.add(inputPnl, BorderLayout.SOUTH);
		outputPnl = new JPanel();
		outputPnl.setLayout(new GridLayout(3, 1));
		strikePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
		strikeText = new JLabel("S");
		strikeText.setFont(new Font("Fira Code", Font.BOLD, 32));
		strikePnl.add(strikeText);
		for (int i = 0; i < strikeCnt.length; i++) {
			strikeCnt[i] = new JLabel(gongImg);
			strikePnl.add(strikeCnt[i]);
		}
		ballPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
		ballText = new JLabel("B");
		ballText.setFont(new Font("Fira Code", Font.BOLD, 32));
		ballPnl.add(ballText);
		for (int i = 0; i < ballCnt.length; i++) {
			ballCnt[i] = new JLabel(gongImg);
			ballPnl.add(ballCnt[i]);
		}
		outPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
		outText = new JLabel("O");
		outText.setFont(new Font("Fira Code", Font.BOLD, 32));
		outPnl.add(outText);
		outPnl.add(outCnt);
		outputPnl.add(strikePnl);
		outputPnl.add(ballPnl);
		outputPnl.add(outPnl);

		c.add(outputPnl, BorderLayout.CENTER);
		setSize(400, 500);
		setVisible(true);
	}

	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int user[] = new int[3];
			String[] temp = tf.getText().split("");
			tf.setText("");
			for (int i = 0; i < temp.length; i++) {
				user[i] = Integer.parseInt(temp[i]);
			}
			UserInput player = new UserInput(com.getComData(), user);
			if (player.getStrike() == 3) {
				outputPnl.removeAll();
				JLabel homeRun = new JLabel("Home Run!!");
				homeRun.setFont(new Font("Fira Code", Font.BOLD, 60));
				outputPnl.add(homeRun);
			}
			if (player.getStrike() == 2) {
				strikeCnt[0].setVisible(true);
				strikeCnt[1].setVisible(true);
			}
			if (player.getStrike() == 1) {
				strikeCnt[0].setVisible(true);
				strikeCnt[1].setVisible(false);
			}
			if (player.getStrike() == 0) {
				strikeCnt[0].setVisible(false);
				strikeCnt[1].setVisible(false);
			}
			if (player.getBall() == 3) {
				ballCnt[0].setVisible(true);
				ballCnt[1].setVisible(true);
				ballCnt[2].setVisible(true);
			}
			if (player.getBall() == 2) {
				ballCnt[0].setVisible(true);
				ballCnt[1].setVisible(true);
				ballCnt[2].setVisible(false);
			}
			if (player.getBall() == 1) {
				ballCnt[0].setVisible(true);
				ballCnt[1].setVisible(false);
				ballCnt[2].setVisible(false);
			}
			if (player.getBall() == 3) {
				ballCnt[0].setVisible(false);
				ballCnt[1].setVisible(false);
				ballCnt[2].setVisible(false);
			}
			if (player.isOut() == true) {
				outCnt.setVisible(true);
			} else {
				outCnt.setVisible(false);
			}
		}

	}

	public static void main(String[] args) {
		new BaseballGame_GUI(new ComRandomNum());
	}

}

class ComRandomNum {
	private int[] comData;
	private Random r;

	public ComRandomNum() {
		r = new Random();
		comData = new int[3];
		comData[0] = r.nextInt(9) + 1;
		comData[1] = r.nextInt(9) + 1;
		while (comData[0] == comData[1])
			comData[1] = r.nextInt(9) + 1;
		comData[2] = r.nextInt(3);
		while (comData[0] == comData[2] || comData[1] == comData[2])
			comData[2] = r.nextInt(9) + 1;
	}

	public int[] getComData() {
		return comData;
	}
}

class UserInput {
	private int strike, ball;
	private boolean out;

	public UserInput(int com[], int user[]) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (com[i] == user[j]) {
					if (i == j)
						strike++;
					else
						ball++;
				}
			}
		}
	}

	public int getStrike() {
		return strike;
	}

	public void setStrike(int strike) {
		this.strike = strike;
	}

	public int getBall() {
		return ball;
	}

	public void setBall(int ball) {
		this.ball = ball;
	}

	public boolean isOut() {
		return out;
	}

	public void setOut(boolean out) {
		this.out = out;
	}

}