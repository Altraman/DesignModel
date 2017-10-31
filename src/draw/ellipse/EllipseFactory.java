package draw.ellipse;

import draw.GraphicFactory;

/**
 * Created by Hu on 2017/10/31.
 */
public class EllipseFactory extends GraphicFactory<Ellipse> {

    private static final class Holder {
        private static final EllipseFactory INSTANCE = new EllipseFactory();
    }

    public static EllipseFactory getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    public Ellipse createGraphic() {
        return new Ellipse();
    }
}
