package controller;

import gui.PomodoroFrame;
import logic.Model;

public class Main {
	public static void main(String args[]){
	      PomodoroFrame veiw= new PomodoroFrame();
	      Model model= new Model();
	      Controller controler= new Controller(veiw, model);

	}
}
