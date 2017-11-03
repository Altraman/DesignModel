package draw;

import draw.lalala.LalalaFactory;

/**
 * Created by Hu on 2017/10/31.
 */
public class TestDraw {
    public static void main(String[] args) {
        Graphics graphics = LalalaFactory.getInstance().createGraphic();
        try {
            graphics.area();
            graphics.volume();
        } catch (UnsupportedShapeException e) {
            e.printStackTrace();
        }
    }
}
