import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Result extends JFrame implements ActionListener {
	private JPanel panel;
	private JLabel labelAsk, labelScore;
	private JButton buttonAgain, buttonExit;
	public Result(int score) {
		super("Puzzle Matching");
		
		this.setSize(900, 600);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		Font fontLabel = new Font("Arial", Font.BOLD, 25);
		
		labelScore = new JLabel("Your Score: " + score);
		labelScore.setFont(fontLabel);
		labelScore.setBounds(320, 200, 200, 30);
		panel.add(labelScore);

		labelAsk = new JLabel("Want to try again?");
		labelAsk.setFont(fontLabel);
		labelAsk.setBounds(300, 250, 260, 30);
		panel.add(labelAsk);
		
		buttonAgain = new JButton("Yes");
		buttonAgain.setBounds(320, 300, 80, 30);
		buttonAgain.addActionListener(this);
		panel.add(buttonAgain);
		
		buttonExit = new JButton("No");
		buttonExit.setBounds(420, 300, 80, 30);
		buttonExit.addActionListener(this);
		panel.add(buttonExit);
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String res = ae.getActionCommand();
		if (res.equals(buttonAgain.getText())) {
			new Puzzle().setVisible(true);
			this.setVisible(false);
		}
		else {
			System.exit(0);
		}
	}
}