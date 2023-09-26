package ua.javarush.games.minigames.mini06;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Діалогові вікна
*/

public class MessageGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
       showMessageDialog(Color.BLACK,"Ви виграли", Color.GREEN,50);
        //напишіть тут ваш код
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        showMessageDialog(Color.BLACK,"Ви програли", Color.RED,50);


        //напишіть тут ваш код
    }
}
