package com.google.Bublles;

import java.awt.event.*;

/**
 *  @author Yura Hilevich
 */
public class Listeners implements KeyListener, MouseListener, MouseMotionListener {

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_UP) {
			Player.up = true;
		}

		if (key == KeyEvent.VK_DOWN) {
			Player.down = true;
		}

		if (key == KeyEvent.VK_LEFT) {
			Player.left = true;
		}

		if (key == KeyEvent.VK_RIGHT) {
			Player.right = true;
		}

		if (key == KeyEvent.VK_SPACE) {
			Player.isFiring = true;
		}

	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_UP) {
			Player.up = false;
		}

		if (key == KeyEvent.VK_DOWN) {
			Player.down = false;
		}

		if (key == KeyEvent.VK_LEFT) {
			Player.left = false;
		}

		if (key == KeyEvent.VK_RIGHT) {
			Player.right = false;
		}

		if (key == KeyEvent.VK_SPACE) {
			Player.isFiring = false;
		}

		if (key == KeyEvent.VK_ESCAPE) {
			GamePanel.state = GamePanel.State.MENU;
		}
	}

	public void keyTyped(KeyEvent keyEvent) {

	}

	public void mouseClicked(MouseEvent mouseEvent) {

	}

	public void mousePressed(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			Player.isFiring = true;
			GamePanel.leftMouse = true;
		}
	}

	public void mouseReleased(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			Player.isFiring = false;
			GamePanel.leftMouse = false;
		}
	}

	public void mouseEntered(MouseEvent mouseEvent) {

	}

	public void mouseExited(MouseEvent mouseEvent) {

	}

	public void mouseDragged(MouseEvent e) {
		GamePanel.mouseX = e.getX();
		GamePanel.mouseY = e.getY();
	}

	public void mouseMoved(MouseEvent e) {
		GamePanel.mouseX = e.getX();
		GamePanel.mouseY = e.getY();
	}
}
