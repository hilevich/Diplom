package com.google.Bublles;

import java.awt.*;

/**
 *  @author Yura Hilevich
 */
public class Player {

	private double x;
	private double y;

	private int radius;
	private int health;

	private int speed;
	private double dx;
	private double dy;

	private Color color;

	public static boolean up;
	public static boolean down;
	public static boolean left;
	public static boolean right;
	public static boolean isFiring;

	public Player() {
		x = GamePanel.WIDTH / 2;
		y = GamePanel.HEIGHT / 2;

		radius = 5;

		speed = 5;

		dx = dy = 0;

		color = Color.WHITE;

		up = down = left = right = isFiring = false;

		health = 3;
	}

	public void update() {
		if (up && y > radius) {
			dy = -speed;
		}

		if (down && y < GamePanel.HEIGHT - radius) {
			dy = speed;
		}

		if (left && x > radius) {
			dx = -speed;
		}

		if (right && x < GamePanel.WIDTH - radius) {
			dx = speed;
		}

		if (up && left || up && right || down && left || down && right) {
			dy = dy * Math.sin(Math.toRadians(45));
			dx = dx * Math.cos(Math.toRadians(45));
		}

		y += dy;
		x += dx;

		dy = 0;
		dx = 0;

		if (isFiring) {
			GamePanel.bullets.add(new Bullet(x, y));
		}
	}

	public void draw(Graphics2D g) {
		g.setColor(color);
		g.fillOval((int) (x - radius), (int) (y - radius), 2 * radius, 2 * radius);
		g.setStroke(new BasicStroke(3));
		g.setColor(color.darker());
		g.drawOval((int) (x - radius), (int) (y - radius), 2 * radius, 2 * radius);
		g.setStroke(new BasicStroke(1));
	}

	public void hit() {
		health--;
	}

	public double getY() {
		return y;
	}

	public double getX() {
		return x;
	}

}
