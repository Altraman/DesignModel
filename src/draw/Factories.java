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
public class Factories {

    public static Map<Object, Object> getFactories() {
        Map<Object, Object> factories = new HashMap<>();
        factories.put(GraphicsName.ELLIPSE, EllipseFactory.getInstance());
        factories.put(GraphicsName.RECTANGLE, RectangleFactory.getInstance());
        factories.put(GraphicsName.SHAPE, ShapeFactory.getInstance());
        factories.put(GraphicsName.TRIANGLE, TriangleFactory.getInstance());
        factories.put(GraphicsName.LALALA, LalalaFactory.getInstance());
        return factories;
    }
}
