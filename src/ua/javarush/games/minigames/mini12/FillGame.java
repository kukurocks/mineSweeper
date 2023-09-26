package ua.javarush.games.minigames.mini12;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Працюємо зі списком координат
*/

public class FillGame extends Game {
    private final List<Cell> cells = new ArrayList<>();

    @Override
    public void initialize() {
        setScreenSize(10, 10);
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }

    }

    @Override
    public void onMouseLeftClick(int x, int y) {
       setCellColor(x,y,Color.ORANGE);
       final Cell cell = new Cell(x,y);
       if(!cells.contains(cell)){
           cells.add(cell);

       }
            }







    @Override
    public void onMouseRightClick(int x, int y) {
        setCellColor(x,y,Color.WHITE);
        System.out.println(cells);
        final Cell cell = new Cell(x,y);
        if(cells.contains(cell)){
            cells.remove(cell);
        }


    }
    }

