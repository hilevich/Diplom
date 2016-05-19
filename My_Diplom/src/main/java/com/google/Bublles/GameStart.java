package com.google.Bublles;

import javax.swing.*;

/**
 *  @author Yura Hilevich
 */
public class GameStart {
	public void bublles() {

		GamePanel panel = new GamePanel();

		JFrame startFrame = new JFrame("Bubbles");
		// startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		startFrame.setContentPane(panel);
		startFrame.pack();
		startFrame.setLocationRelativeTo(null);
		startFrame.setVisible(true);

		panel.go();
	}
}
