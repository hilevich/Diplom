package com.google.Bublles;

import java.awt.*;

/**
 * @author Yura Hilevich
 */
public class GameBack {

	private Color color;

	public GameBack() {
		color = Color.BLUE;
	}

	public void update() {

	}

	public void draw(Graphics2D g) {
		g.setColor(color);
		g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
	}

}
