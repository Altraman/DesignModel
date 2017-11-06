package draw.lalala;

import draw.ICalculateListener;
import draw.ShapeFactory;
import draw.UnsupportedShapeException;

/**
 * Created by Hu on 2017/10/31.
 */
public class WrongShapeFactory extends ShapeFactory<WrongShape> {
    private static final class Holder {
        private static final WrongShapeFactory INSTANCE = new WrongShapeFactory();
    }

    public static WrongShapeFactory getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    public WrongShape createGraphic() {
        initListener();
        return new WrongShape(mListener);
    }

    @Override
    protected void initListener() {
        mListener = new ICalculateListener() {
            @Override
            public void calculateArea() {

            }

            @Override
            public void calculateVolume() {

            }

            @Override
            public void calculateWrong() throws UnsupportedShapeException {
                throw new UnsupportedShapeException("不支持该图形");
            }
        };
    }
}
