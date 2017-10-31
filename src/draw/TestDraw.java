package draw;

import draw.lalala.Lalala;
import draw.lalala.LalalaFactory;

/**
 * Created by Hu on 2017/10/31.
 */
public class TestDraw {
    public static void main(String[] args) {
        LalalaFactory lalalaFactory = getFactory(GraphicsName.LALALA);
        Lalala lalala = lalalaFactory.createGraphic();
        lalala.area();
        lalala.volume();
    }

    @SuppressWarnings("unchecked")
    private static <T> T getFactory(Object key) {
        final Object value = Factories.getFactories().get(key);
        return (T) value;
    }
}
