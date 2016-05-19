package com.google.Bublles;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Yura Hilevich
 */
public class GamePanel extends JPanel implements Runnable {

	public static int WIDTH = 500;
	public static int HEIGHT = 500;

	private int FPS;
	private long timerFPS;
	private double millisToFPS;
	private int sleepTime;

	private Thread thread;

	private BufferedImage image;
	private Graphics2D g;

	private GameBack background;

	public static int mouseX;
	public static int mouseY;

	public static boolean leftMouse;

	public static Player player;
	public static Wave wave;
	public static Menu menu;
	public static ArrayList<Bullet> bullets;
	public static ArrayList<Enemy> enemies;

	public static enum State {
		MENU, PLAY
	}

	public static State state = State.MENU;

	public GamePanel() {
		super();

		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
		requestFocus();

		addKeyListener(new Listeners());
		addMouseMotionListener(new Listeners());
		addMouseListener(new Listeners());
	}

	public void go() {
		thread = new Thread(this);
		thread.start();
	}

	public void run() {

		FPS = 30;
		millisToFPS = 1000 / FPS;

		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = (Graphics2D) image.getGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		background = new GameBack();
		leftMouse = false;

		player = new Player();
		wave = new Wave();
		menu = new Menu();
		bullets = new ArrayList<Bullet>();
		enemies = new ArrayList<Enemy>();

		Toolkit kit = Toolkit.getDefaultToolkit();
		BufferedImage im = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g3 = (Graphics2D) im.getGraphics();
		g3.setColor(new Color(255, 255, 255));
		g3.drawOval(0, 0, 4, 4);
		g3.drawLine(2, 0, 2, 4);
		g3.drawLine(0, 2, 4, 2);
		Cursor cursor = kit.createCustomCursor(im, new Point(3, 3), "mc");
		g3.dispose();

		while (true) {

			setCursor(cursor);

			timerFPS = System.nanoTime();

			if (state.equals(State.MENU)) {
				background.update();
				background.draw(g);

				menu.update();
				menu.draw(g);

				gameDraw();
			}

			if (state.equals(State.PLAY)) {
				gameUpdate();
				gameRender();
				gameDraw();
			}

			timerFPS = (System.nanoTime() - timerFPS) / 1000000;

			sleepTime = 1;

			if (millisToFPS > timerFPS) {
				sleepTime = (int) (millisToFPS - timerFPS);
			}

			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			timerFPS = 0;
		}

	}

	public void gameUpdate() {
		background.update();
		player.update();

		// update bullets
		for (Iterator<Bullet> iterator = bullets.iterator(); iterator.hasNext();) {
			Bullet bullet = iterator.next();
			if (bullet.needRemove()) {
				iterator.remove();
			} else {
				bullet.update();
			}
		}

		// update enemies
		for (Iterator<Enemy> iterator = enemies.iterator(); iterator.hasNext();) {
			Enemy enemy = iterator.next();
			if (enemy.needRemove()) {
				iterator.remove();
			} else {
				enemy.update();
			}
		}

		// bullets & enemies collision
		for (Iterator<Enemy> eit = enemies.iterator(); eit.hasNext();) {
			Enemy enemy = eit.next();

			for (Iterator<Bullet> bit = bullets.iterator(); bit.hasNext();) {
				Bullet bullet = bit.next();

				double dx = enemy.getX() - bullet.getX();
				double dy = enemy.getY() - bullet.getY();
				double dist = Math.sqrt(dx * dx + dy * dy);

				if ((int) dist <= enemy.getRadius()) {
					enemy.hit();
					bit.remove();
					if (enemy.needRemove()) {
						try {
							eit.remove();
						} catch (IllegalStateException e) {
							e.printStackTrace();
						}
					}
				}
			}

		}

		for (Iterator<Enemy> eit = enemies.iterator(); eit.hasNext();) {
			Enemy enemy = eit.next();
			double dx = enemy.getX() - player.getX();
			double dy = enemy.getY() - player.getY();
			double dist = Math.sqrt(dx * dx + dy * dy);

			if ((int) dist <= enemy.getRadius()) {
				enemy.hit();
				if (enemy.needRemove()) {
					eit.remove();
				}
			}
		}

		wave.update();
	}

	public void gameRender() {
		background.draw(g);
		player.draw(g);

		for (Bullet bullet : bullets) {
			bullet.draw(g);
		}

		for (Enemy enemy : enemies) {
			enemy.draw(g);
		}

		if (wave.needShow()) {
			wave.draw(g);
		}

	}

	private void gameDraw() {
		Graphics g2 = this.getGraphics();
		g2.drawImage(image, 0, 0, null);
		g2.dispose();
	}

}
