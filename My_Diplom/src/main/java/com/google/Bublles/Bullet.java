package com.google.Bublles;

import java.awt.*;

/**
 * @author Yura Hilevich
 */
public class Bullet {

	private double x;
	private double y;

	private double dx;
	private double dy;

	private double dix;
	private double diy;
	private double di;

	private int radius;

	private double speed;

	private Color color;

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
		return y < 0 || y > GamePanel.HEIGHT || x < 0 || x > GamePanel.WIDTH;
	}

	public Bullet(double x, double y) {
		this.x = x;
		this.y = y;
		radius = 2;
		speed = 10;
		color = Color.WHITE;

		dix = GamePanel.mouseX - this.x;
		diy = GamePanel.mouseY - this.y;
		di = Math.sqrt(dix * dix + diy * diy);

		dx = (dix / di) * speed;
		dy = (diy / di) * speed;

	}

	public void update() {
		y += dy;
		x += dx;
	}

	public void draw(Graphics2D g) {
		g.setColor(color);
		g.fillOval((int) x, (int) y, radius, 2 * radius);
	}

}
