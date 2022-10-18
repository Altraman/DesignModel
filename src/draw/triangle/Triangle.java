package draw.triangle;

import draw.Graphics;
import draw.ICalculateListener;

/**
 * Created by Hu on 2017/10/31.
 */
public class Triangle extends Graphics {
    private final ICalculateListener listener;

    public Triangle(ICalculateListener listener) {
        this.listener = listener;
    }

    @Override
    public void area() {
        listener.calculateArea();
    }

    @Override
    public void volume() {
        listener.calculateVolume();
    }
}
