package ru.braun.rgbcircles;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by admin on 05.12.2015.
 */
public class GameManager {
    private CanvasView canvasView;
    private int width;
    private int height;
    private MainCircle mainCircle;

    public GameManager(CanvasView canvasView, int w, int h) {
        this.canvasView = canvasView;
        width = w;
        height = h;
        initMainCircle();

    }


    private void initMainCircle() {
        mainCircle = new MainCircle(width / 2, height / 2);
    }

    public void onDraw() {
        canvasView.drawCircle(mainCircle);
    }
}
