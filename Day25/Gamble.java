package Day25;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Gamble extends JFrame {
	private ImageIcon img[] = { new ImageIcon("images/dog.jpg"), new ImageIcon("images/cat.jpg"),
			new ImageIcon("images/pig.jpg"), new ImageIcon("images/monkey.jpg"), new ImageIcon("images/rabbit.jpg"), };
	private JLabel slot[] = { new JLabel(img[0]), new JLabel(img[1]), new JLabel(img[2]) };
	private JLabel resultLbl = new JLabel("마우스를 클릴할 때 마다 게임합니다.");
	private Random r = new Random();
	private boolean gambling = false;

	public Gamble() {
		setTitle("Gamble game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 1));
		JPanel displayAnimal = new JPanel(new GridLayout(1, 3, 15, 15));
		for (int i = 0; i < slot.length; i++) {
			slot[i].setOpaque(true);
			displayAnimal.add(slot[i]);
		}
		c.add(displayAnimal);
		JPanel displayResult = new JPanel();
		displayResult.setLayout(new BorderLayout());
		resultLbl.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		resultLbl.setHorizontalAlignment(SwingConstants.CENTER);
		displayResult.add(resultLbl, BorderLayout.CENTER);
		c.add(displayResult);
		Roller th = new Roller();
		th.start();
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				startgamble();
			}
		});
		setSize(400, 350);
		setVisible(true);
	}

	synchronized public void rolling() {
		if (gambling) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (int i = 0; i < slot.length; i++) {
			slot[i].setIcon(img[r.nextInt(slot.length)]);
		}
		notify();
	}

	synchronized public void startgamble() {
		gambling = true;
		for (int i = 0; i < slot.length; i++) {
			slot[i].setIcon(img[r.nextInt(slot.length)]);
		}
		if (slot[0].getIcon() == slot[1].getIcon() && slot[0].getIcon() == slot[2].getIcon()) {
			resultLbl.setText("축하합니다!!");
		} else {
			resultLbl.setText("아쉽군요");
		}
		gambling = false;
		notify();
	}

	class Roller extends Thread {
		@Override
		public void run() {
			while (true) {
				try {
					sleep(200);
					rolling();
					resultLbl.setText("마우스를 클릴할 때 마다 게임합니다.");
				} catch (InterruptedException e) {
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		new Gamble();
	}

}
