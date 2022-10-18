package draw.circle;

import draw.ICalculateListener;
import draw.ShapeFactory;
import draw.UnsupportedShapeException;

/**
 * Created by Hu on 2017/10/31.
 */
public class CircleFactory extends ShapeFactory<Circle> {

    private static final class Holder {
        private static final CircleFactory INSTANCE = new CircleFactory();
    }

    public static CircleFactory getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    public Circle createGraphic() {
        initListener();
        return new Circle(mListener);
    }

    @Override
    protected void initListener() {
        mListener = new ICalculateListener() {
            @Override
            public void calculateArea() {
                System.out.println("圆的面积");
            }

            @Override
            public void calculateVolume() {
                System.out.println("圆的体积");
            }

            @Override
            public void calculateWrong() throws UnsupportedShapeException {

            }
        };
    }
}
