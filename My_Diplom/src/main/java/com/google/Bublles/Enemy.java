package com.google.Bublles;

import java.awt.*;

/**
 * @author Yura Hilevich
 */
public class Enemy {

	private double x;
	private double y;

	private int radius;

	private double health;

	private double speed;
	private double dx;
	private double dy;

	private Color color;

	private int type;
	private int rank;

	public Enemy(int type, int rank) {
		this.type = type;
		this.rank = rank;

		if (type == 1) {

			color = Color.GREEN;

			if (rank == 1) {

				x = Math.random() * GamePanel.WIDTH;
				y = 0;

				speed = 2;
				radius = 7;
				health = 2;

				dx = Math.sin(Math.toRadians(Math.random() * 360)) * speed;
				dy = Math.cos(Math.toRadians(Math.random() * 360)) * speed;
			}
		}

	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public int getRadius() {
		return radius;
	}

	public boolean needRemove() {
		return health <= 0;
	}

	public void hit() {
		health--;
	}

	public void update() {
		x += dx;
		y += dy;

		if (x < 0 && dx < 0)
			dx = -dx;
		if (x > GamePanel.WIDTH && dx > 0)
			dx = -dx;

		if (y < 0 && dy < 0)
			dy = -dy;
		if (y > GamePanel.HEIGHT && dy > 0)
			dy = -dy;
	}

	public void draw(Graphics2D g) {
		g.setColor(color);
		g.fillOval((int) (x - radius), (int) (y - radius), 2 * radius, 2 * radius);
		g.setStroke(new BasicStroke(3));
		g.setColor(color.darker());
		g.drawOval((int) (x - radius), (int) (y - radius), 2 * radius, 2 * radius);
		g.setStroke(new BasicStroke(1));
	}

}
