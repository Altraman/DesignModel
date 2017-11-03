package draw.lalala;

import draw.ICalculateListener;
import draw.ShapeFactory;
import draw.UnsupportedShapeException;

/**
 * Created by Hu on 2017/10/31.
 */
public class LalalaFactory extends ShapeFactory<Lalala> {
    private static final class Holder {
        private static final LalalaFactory INSTANCE = new LalalaFactory();
    }

    public static LalalaFactory getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    public Lalala createGraphic() {
        initListener();
        return new Lalala(mListener);
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
