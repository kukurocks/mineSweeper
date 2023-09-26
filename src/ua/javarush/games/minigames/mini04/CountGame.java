package ua.javarush.games.minigames.mini04;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Рахуємо клітини
*/

public class CountGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(10, 10);
        showGrid(false);
        for (int j = 0; j < 50; j++) {
            int x = getRandomNumber(10);
            int y = getRandomNumber(10);
            setCellColor(x, y, Color.GREEN);
            setCellNumber(x, y, getRandomNumber(100));
        }
        showResult();
    }

    public void showResult() {

        int sum=0;
        int count=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sum += getCellNumber(i,j);
                if(getCellColor(i,j)==Color.GREEN){
                count++;}
            }
        }
        printSum(sum);
        printCountOfGreenCells(count);//напишіть тут ваш код
    }

    private void printSum(int sum) {
        System.out.println("Сума всіх чисел = " + sum);
    }

    private void printCountOfGreenCells(int count) {
        System.out.println("Кількість зелених клітин = " + count);
    }
}
