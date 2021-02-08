package Day25;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Practical_Question_9 extends JFrame {
	private Random r = new Random();
	private JPanel topPanel, botPanel;
	private ImageIcon img[] = { new ImageIcon("images/rock.jpg"), new ImageIcon("images/scissors.jpg"),
			new ImageIcon("images/paper.jpg") };
	private JLabel meLbl, comLbl, meImgLbl, comImgLbl, resLbl;

	public Practical_Question_9() {
		setTitle("가위 바위 보 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		///////////////////////////////////////////////////////
		topPanel = new JPanel();
		topPanel.setBackground(Color.GRAY);
		topPanel.setOpaque(true);
		JButton rockBtn = new JButton(img[0]);
		JButton scissorBtn = new JButton(img[1]);
		JButton paperBtn = new JButton(img[2]);
		rockBtn.addActionListener(new MyActionListener());
		scissorBtn.addActionListener(new MyActionListener());
		paperBtn.addActionListener(new MyActionListener());
		topPanel.add(rockBtn);
		topPanel.add(scissorBtn);
		topPanel.add(paperBtn);
		////////////////////////////////////////////////////////
		botPanel = new JPanel();
		botPanel.setBackground(Color.YELLOW);
		botPanel.setOpaque(true);
		meLbl = new JLabel("ME");
		meImgLbl = new JLabel(img[0]);
		comLbl = new JLabel("COM");
		comImgLbl = new JLabel(img[0]);
		resLbl = new JLabel("  ???");
		resLbl.setForeground(Color.RED);
		resLbl.setFont(new Font("굴림체", Font.BOLD, 14));
		botPanel.add(meImgLbl);
		botPanel.add(meLbl);
		botPanel.add(comImgLbl);
		botPanel.add(comLbl);
		botPanel.add(resLbl);
		/////////////////////////////////////////////////////////
		c.add(topPanel, BorderLayout.NORTH);
		c.add(botPanel, BorderLayout.CENTER);

		setSize(500, 450);
		setVisible(true);
	}

	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			int meChoice = 0, comChoice = 0;
			if (btn.getIcon() == img[0]) {
				meImgLbl.setIcon(img[0]);
				meChoice = 0;
				if (r.nextInt(3) == 0) {
					comImgLbl.setIcon(img[0]);
					comChoice = 0;
				} else if (r.nextInt(3) == 1) {
					comImgLbl.setIcon(img[1]);
					comChoice = 1;
				} else {
					comImgLbl.setIcon(img[2]);
					comChoice = 2;
				}
			} else if (btn.getIcon() == img[1]) {
				meImgLbl.setIcon(img[1]);
				meChoice = 1;
				if (r.nextInt(3) == 0) {
					comImgLbl.setIcon(img[0]);
					comChoice = 0;
				} else if (r.nextInt(3) == 1) {
					comImgLbl.setIcon(img[1]);
					comChoice = 1;
				} else {
					comImgLbl.setIcon(img[2]);
					comChoice = 2;
				}
			} else {
				meImgLbl.setIcon(img[2]);
				meChoice = 2;
				if (r.nextInt(3) == 0) {
					comImgLbl.setIcon(img[0]);
					comChoice = 0;
				} else if (r.nextInt(3) == 1) {
					comImgLbl.setIcon(img[1]);
					comChoice = 1;
				} else {
					comImgLbl.setIcon(img[2]);
					comChoice = 2;
				}
			}
			calc(meChoice, comChoice);
		}

		public void calc(int a, int b) {
			if ((a - b) == 0)
				resLbl.setText("\t비김");
			else if ((a - b) == -1 || (a - b) == 2)
				resLbl.setText("\t이김");
			else
				resLbl.setText("\t짐");
		}

	}

	public static void main(String[] args) {
		new Practical_Question_9();
	}

}
