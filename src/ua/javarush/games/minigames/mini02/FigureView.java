package ua.javarush.games.minigames.mini02;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Відображаємо корабель
*/

public class FigureView extends Game {
    public void initialize(){
        setScreenSize(5,7);
        showShip();

    }

    public static final int[][] SHIP = new int[][]{
            {0, 0, 7, 0, 0},
            {0, 7, 7, 7, 0},
            {0, 7, 0, 7, 0},
            {0, 7, 7, 7, 0},
            {0, 7, 0, 7, 0},
            {7, 7, 7, 7, 7},
            {7, 0, 7, 0, 7},
    };

    //напишіть тут ваш код

    public void showShip() {
        for (int i = 0; i < SHIP.length; i++) {
            for (int j = 0; j < SHIP[0].length; j++) {
                setCellColor(j, i, Color.values()[SHIP[i][j]]);
            }
        }
    }
}
