package logic;

import java.awt.Color;

public class WorkStrategy implements Strategy {

	@Override
	public Color getColor() {
		return new Color(255,0,0);
	}

}
