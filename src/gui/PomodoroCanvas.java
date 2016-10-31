package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import logic.Strategy;
import logic.WorkStrategy;


public class PomodoroCanvas extends JPanel{
	private Strategy type;
	public PomodoroCanvas(){
		getPreferredSize();
		setBackground(Color.gray);
		setVisible(true);
		setLayout(null);
		type= new WorkStrategy();
	}


	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		setUp(g);

	}


	/**
	 * @param g
	 */
	public void setUp(Graphics g) {
		int pos=25;
		int width=550;
		int height=450;
		int alpha=60;
		for(int num=0; num<5;num++){
			Color color=new Color(type.getColor().getRed(), type.getColor().getGreen(),type.getColor().getBlue(),alpha);
			g.setColor(color);
			g.fillRect(pos, pos, width, height);
			g.setColor(color.gray.brighter());
			g.drawRect(pos, pos, width, height);
			width-=50;
			height-=50;
			pos+=25;
			alpha+=25;
		}
	}
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(600,500);
	}





}
