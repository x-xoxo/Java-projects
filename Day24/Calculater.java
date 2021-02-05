package Day24;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculater extends JFrame {
	public Calculater() {
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		JPanel panelNorth = new JPanel();
		JPanel panelCenter = new JPanel(new GridLayout(4, 4));
		JPanel panelSouth = new JPanel();
		panelNorth.add(new JLabel("수식입력"));
		JTextField calcTextField = new JTextField();
		panelNorth.add(calcTextField);
		JButton btnNum[] = new JButton[10];
		for (int i = 0; i < btnNum.length; i++) {
			btnNum[i] = new JButton(Integer.toString(i));
			panelCenter.add(btnNum[i]);
		}
		JButton btnClear = new JButton("CE");
		panelCenter.add(btnClear);
		JButton btnCalc = new JButton("계산");
		panelCenter.add(btnCalc);
		JButton btnOp[] = new JButton[4];
		for (int i = 0; i < btnOp.length; i++) {
			if (i == 0)
				btnOp[i] = new JButton("+");
			else if (i == 1)
				btnOp[i] = new JButton("-");
			else if (i == 2)
				btnOp[i] = new JButton("*");
			else
				btnOp[i] = new JButton("/");
			panelCenter.add(btnOp[i]);
		}
		panelSouth.add(new JLabel("계산 결과"));
		JTextField resTextField = new JTextField();
		panelSouth.add(calcTextField);
		c.add(panelNorth);
		c.add(panelCenter);
		c.add(panelSouth);
		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Calculater();
	}

}
