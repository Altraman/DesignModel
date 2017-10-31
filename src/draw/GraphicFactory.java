package draw;

/**
 * Created by Hu on 2017/10/31.
 */
public abstract class GraphicFactory<T extends Graphics> {
    public abstract T createGraphic();
}
