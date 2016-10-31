package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StartingPanel extends JPanel {

	private boolean notReady=true;
	public StartingPanel(){
		getPreferredSize();
		setBackground(Color.cyan);
		setVisible(true);
		createElements();
		setLayout(null);

	}
	public void createElements() {
		// the elements
		JButton okButn = new JButton("Ready to go!!!");
		JLabel workLabel= new JLabel("Work Time Ammount:");
		JTextField workText= new JTextField(1);
		JLabel restLabel= new JLabel("Rest Time Ammount:");
		JTextField restText= new JTextField(1);
		//postioning the elements
		okButn.setBounds(80,240,200,30);
		workLabel.setBounds(5,5,330,30);
		workText.setBounds(155,10,100,20);
		//adding the elements
		add(okButn);
		add(workLabel);
		add(workText);
	    
		okButn.addActionListener((ActionEvent e) ->{
		      notReady=false;
		    });

	}
	public boolean notReady() {
		return notReady;
	}

	@Override
	public Dimension getPreferredSize(){
		return new Dimension(700,300);
	}

}
