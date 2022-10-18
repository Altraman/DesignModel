package draw.ellipse;

import draw.Graphics;
import draw.ICalculateListener;

/**
 * Created by Hu on 2017/10/31.
 */
public class Ellipse extends Graphics {
    private final ICalculateListener listener;

    public Ellipse(ICalculateListener listener) {
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
