package draw.shape;

import draw.GraphicFactory;

/**
 * Created by Hu on 2017/10/31.
 */
public class ShapeFactory extends GraphicFactory<Shape> {

    private static final class Holder {
        private static final ShapeFactory INSTANCE = new ShapeFactory();
    }

    public static ShapeFactory getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    public Shape createGraphic() {
        return new Shape();
    }
}
