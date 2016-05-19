package com.google.SeaBattle.main.sea_battle_java_courses.swing_logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

import com.google.SeaBattle.main.sea_battle_java_courses.game_logic.Field;
/**
 * @author Yura Hilevich
 */
public class SeaBattleSwing extends JFrame {

	private SwingField playerField;
	private SwingField computerField;

	public SeaBattleSwing() {
		setTitle("Sea Battle, Swing version");
		// setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(SwingField.WIDTH * 2 + 37, SwingField.HEIGHT + 68);

		playerField = new SwingField(true, this);
		computerField = new SwingField(false, this);

		add(playerField);
		add(computerField);

		playerField.setLocation(10, 10);
		computerField.setLocation(SwingField.WIDTH + 20, 10);

		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}

	public SwingField getPlayerField() {
		return playerField;
	}

	public SwingField getComputerField() {
		return computerField;
	}

	public void drawGameField(Field playerFieldMap, Field computerFieldMap) {
		playerField.setField(playerFieldMap);
		computerField.setField(computerFieldMap);

		playerField.printField();
	}

	public void addMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menuFile = new JMenu("����");
		JMenu menuHelp = new JMenu("�������");
		JMenuItem menuItem = new JMenuItem("");
		menuFile.setMnemonic(KeyEvent.VK_F);

		JMenuItem eMenuFileItemExit = new JMenuItem("�����");
		eMenuFileItemExit.setMnemonic(KeyEvent.VK_C);
		eMenuFileItemExit.setToolTipText("����� �� ����������");
		eMenuFileItemExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});

		JMenuItem eMenuFileItemRestartGame = new JMenuItem("����� ����");
		eMenuFileItemRestartGame.setMnemonic(KeyEvent.VK_C);
		eMenuFileItemRestartGame.setToolTipText("���������� ����");
		eMenuFileItemRestartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			
			}

		});

		JMenuItem eMenuHelpItemAbout = new JMenuItem("� ���������");
		eMenuHelpItemAbout.setMnemonic(KeyEvent.VK_C);
		eMenuHelpItemAbout.setToolTipText("� ���������");
		eMenuHelpItemAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				final AboutProgramWindow about = new AboutProgramWindow();
				about.createAndShowGUI();
			}
		});

		menuFile.add(eMenuFileItemRestartGame);
		menuFile.add(eMenuFileItemExit);
		menuHelp.add(eMenuHelpItemAbout);

		menuBar.add(menuFile);
		menuBar.add(menuHelp);

		setJMenuBar(menuBar);
	}

}
