package draw;

/**
 * Created by HuQiang on 2017/11/2.
 */
public abstract class ShapeFactory<T extends Graphics>{

    protected abstract T createGraphic();

    protected abstract void initListener();

    protected ICalculateListener mListener;

}
