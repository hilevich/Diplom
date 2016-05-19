package com.google.SeaBattle.main;



import javax.swing.*;

import com.google.SeaBattle.main.sea_battle_java_courses.game_logic.SeaBattle;
import com.google.SeaBattle.main.sea_battle_java_courses.swing_logic.SeaBattleSwing;



/**
 * @author Yura Hilevich
 */
public class SeaBattleMain {

    public void seaBattleMain() {
        final SeaBattle game = new SeaBattle();

        SwingUtilities.invokeLater(new Runnable() {
            
	    public void run() {
                SeaBattleSwing seaBattle = new SeaBattleSwing();
                seaBattle.addMenuBar();
                seaBattle.drawGameField(game.getPlayerField(), game.getComputerField());
                game.setSeaBattleSwing(seaBattle);

                
            }
        });

        game.play();

    }

}
