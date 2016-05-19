package com.google.SeaBattle.main.sea_battle_java_courses.swing_logic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * @author Yura Hilevich
 */
public class AboutProgramWindow implements ActionListener, MouseListener { // TODO
	private static String aboutGameText = "Игра Морской бой версия 0.7";
	final JLabel label = new JLabel(aboutGameText);

	private JFrame frame;

	public void actionPerformed(ActionEvent e) {
	
		frame.dispose(); 
	}

	public void mouseClicked(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public Component createComponents(JFrame frame) {
		this.frame = frame;
		JButton button = new JButton("ОК");
		button.setMnemonic(KeyEvent.VK_I);
		button.addActionListener(this);
		label.setLabelFor(button);

	
		JPanel pane = new JPanel();

		pane.setPreferredSize(new Dimension(300, 200));
		pane.setLocation(100, 100); 
		pane.add(label);
		pane.add(button);
		pane.setBorder(BorderFactory.createEmptyBorder(30, // top
				30, // left
				10, // bottom
				30) // right
		);
		pane.addMouseListener(this);

		return pane;
	}

	public static void createAndShowGUI() {
		JFrame frame = new JFrame(aboutGameText);

		AboutProgramWindow swingExample = new AboutProgramWindow();
		Component contents = swingExample.createComponents(frame);
		frame.getContentPane().add(contents, BorderLayout.CENTER);

		frame.pack();
		frame.setVisible(true);
	}

	public void seaBattle() {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				createAndShowGUI();
			}
		});
	}

}
