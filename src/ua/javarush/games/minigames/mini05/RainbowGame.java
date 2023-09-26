package ua.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Кольори веселки
*/

public class RainbowGame extends Game {

    public void initialize(){
        setScreenSize(10,7);
        showGrid(false);
        Color color[] = {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.BLUE,Color.INDIGO,Color.VIOLET};

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                setCellColor(j,i,color[i]);

            }
        }


        }

    }


    //напишіть тут ваш код

