import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	private final JButton button1;
	private final JButton button2;
	private final JButton button3;
	private final JButton button4;
	private final JButton button5;
	private final JButton button6;
	private final JButton button7;
	private final JButton button8;
	private JLabel label;
	MainPanel mainPanel = new MainPanel();
	
	public MainFrame() {
		//label = new JLabel();
		setLayout(new BorderLayout()); // horizontal panel flow
		mainPanel.setBackground(Color.WHITE);
		add(mainPanel, BorderLayout.CENTER);
		JPanel leftPanel = new JPanel(); // MainPanel class inherits methods from JPanel
		JPanel rightPanel = new JPanel(); // creates panel for brush size and clear buttons
		add(leftPanel, BorderLayout.WEST);
		leftPanel.setLayout(new GridLayout(4, 1));
		add(rightPanel, BorderLayout.EAST);
		rightPanel.setLayout(new GridLayout(4, 1));
		

		button1 = new JButton("Black");
		button1.setMaximumSize(new Dimension(200, 200));
		button1.setPreferredSize(new Dimension(50, 50));
		button1.addActionListener(new Button1Listener());
		leftPanel.add(button1);
		
		button2 = new JButton("Red");
		button2.addActionListener(new Button2Listener());
		leftPanel.add(button2);
		
		button3 = new JButton("Green");
		button3.addActionListener(new Button3Listener());
		leftPanel.add(button3);
		
		button4 = new JButton("Blue");
		button4.addActionListener(new Button4Listener());
		leftPanel.add(button4);
		
		button5 = new JButton("Small");
		button5.addActionListener(new Button5Listener());
		rightPanel.add(button5);
		
		button6 = new JButton("Medium");
		button6.addActionListener(new Button6Listener());
		rightPanel.add(button6);
		
		button7 = new JButton("Large");
		button7.addActionListener(new Button7Listener());
		rightPanel.add(button7);
		
		button8 = new JButton("Clear");
		button8.addActionListener(new Button8Listener());
		rightPanel.add(button8);
			
	}
	
	private class Button1Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//label.setText("Black");
			mainPanel.set_color(Color.BLACK, null);
		}
		
	}
	
	private class Button2Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//label.setText("Red");
			mainPanel.set_color(Color.RED, null);
				
		}
		
	}
	private class Button3Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//label.setText("Green");
			mainPanel.set_color(Color.GREEN, null);
		}
	}
	private class Button4Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//label.setText("Blue");
			mainPanel.set_color(Color.BLUE, null);
		}
	}
	private class Button5Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			mainPanel.mySize(10);
			//label.setText("Small");
		}
	}
	private class Button6Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			mainPanel.mySize(20);
			//label.setText("Medium");
		}
	}
	private class Button7Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			mainPanel.mySize(30);
			//label.setText("Large");
		}
	}
	private class Button8Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			mainPanel.clear();
			
			//label.setText("Clear");
		}
	}
	
		
	
	
	
	
}