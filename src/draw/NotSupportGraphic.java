package draw;

/**
 * Created by Hu on 2017/10/31.
 */
public class NotSupportGraphic extends Graphics {

    @Override
    public void area() {
        throw new RuntimeException("该图形不能计算面积");
    }

    @Override
    public void volume() {
        throw new RuntimeException("该图形不能计算体积");
    }
}
