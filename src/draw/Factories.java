package draw;

import draw.ellipse.EllipseFactory;
import draw.lalala.LalalaFactory;
import draw.rectangle.RectangleFactory;
import draw.shape.ShapeFactory;
import draw.triangle.TriangleFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hu on 2017/10/31.
 */
@SuppressWarnings("WeakerAccess")
public final class Factories {

    public static Map<Object, Object> getFactories() {
        Map<Object, Object> factories = new HashMap<>();
        factories.put(FactoriesName.ELLIPSE, EllipseFactory.getInstance());
        factories.put(FactoriesName.RECTANGLE, RectangleFactory.getInstance());
        factories.put(FactoriesName.SHAPE, ShapeFactory.getInstance());
        factories.put(FactoriesName.TRIANGLE, TriangleFactory.getInstance());
        factories.put(FactoriesName.LALALA, LalalaFactory.getInstance());
        return factories;
    }
}
