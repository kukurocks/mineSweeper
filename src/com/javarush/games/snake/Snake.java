package com.javarush.games.snake;

import java.util.ArrayList;
import java.util.List;

public class Snake extends GameObject {

    private List<GameObject> snakeParts = new ArrayList<>();
    public Snake(int x, int y) {
        super(x, y);
        for (int i = 0; i < 3; i++) {
           GameObject gameObject = new GameObject(x+i,y);
           snakeParts.add(gameObject);
        }

    }

}
