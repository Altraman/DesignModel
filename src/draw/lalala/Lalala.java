package draw.lalala;

import draw.Graphics;
import draw.ICalculateListener;
import draw.UnsupportedShapeException;

/**
 * Created by Hu on 2017/10/31.
 */
public class Lalala extends Graphics {
    private final ICalculateListener listener;

    public Lalala(ICalculateListener listener) {
        this.listener = listener;
    }

    @Override
    public void area() throws UnsupportedShapeException {
        listener.calculateWrong();
    }

    @Override
    public void volume() throws UnsupportedShapeException {
        listener.calculateWrong();
    }
}
