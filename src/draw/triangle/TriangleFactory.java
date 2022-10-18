package draw.triangle;

import draw.ICalculateListener;
import draw.ShapeFactory;
import draw.UnsupportedShapeException;

/**
 * Created by Hu on 2017/10/31.
 */
public class TriangleFactory extends ShapeFactory<Triangle> {
    private static final class Holder {
        private static final TriangleFactory INSTANCE = new TriangleFactory();
    }

    public static TriangleFactory getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    public Triangle createGraphic() {
        initListener();
        return new Triangle(mListener);
    }

    @Override
    protected void initListener() {
        mListener = new ICalculateListener() {
            @Override
            public void calculateArea() {
                System.out.println("三角形的面积");
            }

            @Override
            public void calculateVolume() {
                System.out.println("三角形的体积");
            }

            @Override
            public void calculateWrong() throws UnsupportedShapeException {

            }
        };
    }
}
