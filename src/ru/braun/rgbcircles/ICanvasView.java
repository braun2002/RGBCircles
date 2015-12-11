package ru.braun.rgbcircles;

/**
 * Created by admin on 05.12.2015.
 */
public interface ICanvasView {
    void drawCircle(SimpleCircle circle);

    void redraw();

    void showMessage(String text);
}
