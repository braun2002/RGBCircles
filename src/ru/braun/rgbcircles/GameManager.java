package ru.braun.rgbcircles;

import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.ArrayList;

/**
 * Created by admin on 05.12.2015.
 */
public class GameManager {
    public static final int MAX_CIRCLES = 10;
    // private static int height;
    private CanvasView canvasView;
    private ArrayList<EnemyCircle> circles;
    private static int width;
    private static int height;
    private MainCircle mainCircle;

    public GameManager(CanvasView canvasView, int w, int h) {
        this.canvasView = canvasView;
        width = w;
        height = h;
        initMainCircle();
        iniEnemyCircles();

    }

    private void iniEnemyCircles() {
        circles = new ArrayList<EnemyCircle>();
        for (int i = 0; i < MAX_CIRCLES; i++){
            EnemyCircle circle;
            circle = EnemyCircle.getRandomCircle();
            circles.add(circle);
        }
    }

    public static int getHeight() {
        return height;
    }

    public static int getWidth() {
        return width;
    }

    private void initMainCircle() {
        mainCircle = new MainCircle(width / 2, height / 2);
    }

    public void onDraw() {
        canvasView.drawCircle(mainCircle);
        for (EnemyCircle circle : circles){
            canvasView.drawCircle(circle);
        }
    }

    public void onTouchEvent(int x, int y) {
        mainCircle.moveMainCircleWhenTouchAt(x, y);
    }


}
