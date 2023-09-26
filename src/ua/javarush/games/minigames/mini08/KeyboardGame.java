package ua.javarush.games.minigames.mini08;

import com.javarush.engine.cell.*;

/* 
Робота з клавіатурою
*/

public class KeyboardGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }
    @Override
    public void onKeyPress(Key key) {
        if (key == Key.LEFT) {
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 3; j++) {
                    setCellColor(i, j, Color.GREEN);

                }
            }
        };
        if (key == Key.RIGHT) {
            for (int i = 2; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    setCellColor(i, j, Color.GREEN);

                }
            }
        };
        if (key == Key.UP) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 1; j++) {
                    setCellColor(i, j, Color.GREEN);

                }
            }
        };
        if (key == Key.DOWN) {
            for (int i = 0; i < 3; i++) {
                for (int j = 2; j < 3; j++) {
                    setCellColor(i, j, Color.GREEN);

                }
            }
        };
    }

    @Override
    public void onKeyReleased(Key key) {
        if (key == Key.RIGHT||key == Key.LEFT||key == Key.UP||key == Key.DOWN) {
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    setCellColor(x, y, Color.WHITE);
                }
            }


        }
    }
}
