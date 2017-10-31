package draw.triangle;

import draw.GraphicFactory;

/**
 * Created by Hu on 2017/10/31.
 */
public class TriangleFactory extends GraphicFactory<Triangle> {
    private static final class Holder {
        private static final TriangleFactory INSTANCE = new TriangleFactory();
    }

    public static TriangleFactory getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    public Triangle createGraphic() {
        return new Triangle();
    }
}
