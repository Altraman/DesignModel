package draw.rectangle;

import draw.GraphicFactory;

/**
 * Created by Hu on 2017/10/31.
 */
public class RectangleFactory extends GraphicFactory<Rectangle> {
    private static final class Holder {
        private static final RectangleFactory INSTANCE = new RectangleFactory();
    }

    public static RectangleFactory getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    public Rectangle createGraphic() {
        return new Rectangle();
    }
}
