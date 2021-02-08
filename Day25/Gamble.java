package Day25;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Gamble extends JFrame implements Runnable {
	private ImageIcon img[] = {
			new ImageIcon("images/dog.jpg"),
			new ImageIcon("images/cat.jpg"),
			new ImageIcon("images/pig.jpg"),
			new ImageIcon("images/monkey.jpg"),
			new ImageIcon("images/rabbit.jpg"),};
	private JLabel slot[] = {
			new JLabel(img[0]),
			new JLabel(img[1]),
			new JLabel(img[2])};
	private JLabel resultLbl = new JLabel("마우스를 클릴할 때 마다 게임합니다.");
	private Random r = new Random();
	private boolean gambling = false;

	public Gamble() {
		setTitle("Gamble game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 2));
		JPanel displayAnimal = new JPanel();
		for(int i=0;i<slot.length;i++)
			displayAnimal.add(slot[i]);
		JPanel displayResult = new JPanel();
		displayResult.add(resultLbl);
		setSize(300,400);
		setVisible(true);
		Thread th = new Thread(this);
		th.start();
	}

	public static void main(String[] args) {
		new Gamble();
	}
	synchronized public void waitForGambling() throws InterruptedException {
		while(!gambling)
		{
			for(int i=0;i<slot.length;i++)
			{
				slot[i].setIcon(img[r.nextInt(slot.length)]);
			}
			Thread.sleep(200);
		}
	}
	synchronized public void startGambling() throws InterruptedException {
		gambling = true;
		for(int i=0;i<slot.length;i++)
		{
			slot[i].setIcon(img[r.nextInt(slot.length)]);
			Thread.sleep(200);
		}
		
	}

	@Override
	public void run() {
		while(true)
		{
			try {
				waitForGambling();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
