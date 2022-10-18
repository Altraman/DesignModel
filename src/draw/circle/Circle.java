package draw.circle;

import draw.Graphics;
import draw.ICalculateListener;

/**
 * Created by Hu on 2017/10/31.
 */
public class Circle extends Graphics {

    private final ICalculateListener listener;

    public Circle(ICalculateListener listener) {
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
