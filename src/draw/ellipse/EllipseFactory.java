package draw.ellipse;

import draw.ICalculateListener;
import draw.ShapeFactory;

/**
 * Created by Hu on 2017/10/31.
 */
public class EllipseFactory extends ShapeFactory<Ellipse> {

    private static final class Holder {
        private static final EllipseFactory INSTANCE = new EllipseFactory();
    }

    public static EllipseFactory getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    public Ellipse createGraphic() {
        initListener();
        return new Ellipse(mListener);
    }

    @Override
    protected void initListener() {
        mListener = new ICalculateListener() {
            @Override
            public void calculateArea() {
                System.out.println("椭圆的面积");
            }

            @Override
            public void calculateVolume() {
                System.out.println("椭圆的体积");
            }

            @Override
            public void calculateWrong() {

            }
        };
    }
}
