package draw;

/**
 * Created by Hu on 2017/10/31.
 */
public class Draw {
    @SuppressWarnings("unchecked")
    public static <T> T getFactory(Object key) {
        final Object value = Factories.getFactories().get(key);
        return (T) value;
    }
}
