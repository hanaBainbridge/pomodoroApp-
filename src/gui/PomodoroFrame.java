package gui;

import javax.swing.JFrame;

public class PomodoroFrame extends JFrame{
	private PomodoroCanvas canvas;
	private StartingPanel startPanel;
	private JFrame frame= new JFrame();
	public PomodoroFrame(){
		super("PomoroFrame");
		canvas= new PomodoroCanvas();
		startPanel= new StartingPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		add(startPanel);
		pack();
		while(startPanel.notReady()){
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {}
		}

	    remove(startPanel);
		add(canvas);
		pack();
	}
	public static void main(String args[]){
		 PomodoroFrame frame =new PomodoroFrame();
	}

}
