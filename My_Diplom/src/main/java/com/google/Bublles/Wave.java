package com.google.Bublles;

import java.awt.*;

/**
 *  @author Yura Hilevich
 */
public class Wave {

	public long timer;
	public long delay;
	public long diff;

	public int number;
	public int multiplayer;

	private String text;

	public Wave() {
		number = 1;
		multiplayer = 5;
		timer = 0;
		delay = 5000;
		diff = 0;

		text = "-- ÂÎËÍÀ";
	}

	public void update() {
		if (GamePanel.enemies.size() == 0 && timer == 0) {
			timer = System.nanoTime();
		}
		if (timer > 0) {
			diff += (System.nanoTime() - timer) / 1000000;
			timer = System.nanoTime();
		}
		if (diff > delay) {
			createEnemies();
			timer = diff = 0;
			number++;
		}
	}

	public void createEnemies() {
		int enemyCount = number * multiplayer;

		int type = 1;
		int rank = 1;

		if (number < 4) {
			while (enemyCount > 0) {
				GamePanel.enemies.add(new Enemy(type, rank));
				enemyCount -= type * rank;
			}
		}
	}

	public boolean needShow() {
		return timer != 0;
	}

	public void draw(Graphics2D g) {
		double alpha = 255 * Math.sin(Math.toRadians(diff / (delay / 180)));
		alpha = alpha < 0 ? 0 : alpha;
		alpha = alpha > 255 ? 255 : alpha;

		g.setFont(new Font("consoles", Font.PLAIN, 20));

		g.setColor(new Color(255, 255, 255, (int) alpha));

		String t = text + " " + number + " --";

		int l = (int) g.getFontMetrics().getStringBounds(t, g).getWidth();

		g.drawString(t, (GamePanel.WIDTH / 2) - (l / 2), GamePanel.HEIGHT / 2);
	}

}
