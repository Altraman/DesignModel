package draw;

import draw.lalala.WrongShapeFactory;

/**
 * Created by Hu on 2017/10/31.
 */
public class Client {
    public static void main(String[] args) {
        Graphics graphics = WrongShapeFactory.getInstance().createGraphic();
        try {
            graphics.area();
            graphics.volume();
        } catch (UnsupportedShapeException e) {
            e.printStackTrace();
        }
    }
}
