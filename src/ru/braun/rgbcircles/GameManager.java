package ru.braun.rgbcircles;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by admin on 05.12.2015.
 */
public class GameManager {
   // private static int height;
    private CanvasView canvasView;
    private static int width;
    private static int height;
    private MainCircle mainCircle;

    public GameManager(CanvasView canvasView, int w, int h) {
        this.canvasView = canvasView;
        width = w;
        height = h;
        initMainCircle();

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
    }

    public void onTouchEvent(int x, int y) {
        mainCircle.moveMainCircleWhenTouchAt(x, y);
    }


}
