package com.google.Bublles;

import java.awt.*;

/**
 *  @author Yura Hilevich
 */
public class Menu {

	private int btnWidth;
	private int btnHeight;

	private Color color;

	private boolean hover;

	public Menu() {
		btnWidth = 140;
		btnHeight = 60;
		color = Color.WHITE;
		hover = false;
	}

	public void update() {
		hover = false;
		if (GamePanel.mouseX > GamePanel.WIDTH / 2 - btnWidth / 2
				&& GamePanel.mouseX < GamePanel.WIDTH / 2 + btnWidth / 2
				&& GamePanel.mouseY > GamePanel.HEIGHT / 2 - btnHeight / 2
				&& GamePanel.mouseY < GamePanel.HEIGHT / 2 + btnHeight / 2) {
			hover = true;
			if (GamePanel.leftMouse) {
				GamePanel.state = GamePanel.State.PLAY;
			}
		}
	}

	public void draw(Graphics2D g) {
		color = Color.WHITE;

		if (hover) {
			color = Color.BLACK;
		}

		g.setColor(color);
		g.setStroke(new BasicStroke(3));
		g.drawRect((GamePanel.WIDTH / 2) - (btnWidth / 2), (GamePanel.HEIGHT / 2) - (btnHeight / 2), btnWidth,
				btnHeight);
		g.setStroke(new BasicStroke(1));

		g.setColor(color);
		g.setFont(new Font("Consoles", Font.BOLD, 25));

		String t = "Играть";
		int l = (int) g.getFontMetrics().getStringBounds(t, g).getWidth();

		g.drawString(t, (GamePanel.WIDTH / 2) - (l / 2), GamePanel.HEIGHT / 2 + 8);
	}

}
