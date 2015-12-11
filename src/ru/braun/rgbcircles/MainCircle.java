package ru.braun.rgbcircles;

import android.graphics.Color;

/**
 * Created by admin on 05.12.2015.
 */
public class MainCircle extends SimpleCircle{
    public static final int INIT_RADIUS = 50;
    public static final int MAIN_SPEED = 30;
    public static final int OUR_COLOR = Color.BLUE;

    public MainCircle(int x, int y) {
        super(x, y, INIT_RADIUS);
        setColor(OUR_COLOR);
    }


    public void moveMainCircleWhenTouchAt(int x1, int y1) {
        int dx = (x1 - x) * MAIN_SPEED /GameManager.getWidth();
        int dy = (y1 - y) * MAIN_SPEED /GameManager.getHeight();
        x += dx;
        y += dy;
    }
}
