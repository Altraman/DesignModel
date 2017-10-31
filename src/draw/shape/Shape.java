package draw.shape;

import draw.Graphics;

/**
 * Created by Hu on 2017/10/31.
 */
public class Shape extends Graphics {
    @Override
    public void area() {
        System.out.println("圆的面积");
    }

    @Override
    public void volume() {
        System.out.println("圆的体积");
    }
}
