package logic;

import java.awt.Color;

public class RestStrategy implements Strategy {

	@Override
	public Color getColor() {
		return new Color(0,255,0);
	}

}
