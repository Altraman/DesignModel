package draw.rectangle;

import draw.ICalculateListener;
import draw.ShapeFactory;
import draw.UnsupportedShapeException;

/**
 * Created by Hu on 2017/10/31.
 */
public class RectangleFactory extends ShapeFactory<Rectangle> {
    private static final class Holder {
        private static final RectangleFactory INSTANCE = new RectangleFactory();
    }

    public static RectangleFactory getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    public Rectangle createGraphic() {
        initListener();
        return new Rectangle(mListener);
    }

    @Override
    protected void initListener() {
        mListener = new ICalculateListener() {
            @Override
            public void calculateArea() {
                System.out.println("矩形的面积");
            }

            @Override
            public void calculateVolume() {
                System.out.println("矩形的体积");
            }

            @Override
            public void calculateWrong() throws UnsupportedShapeException {

            }
        };
    }
}
