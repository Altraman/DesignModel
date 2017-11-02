package draw;

/**
 * Created by Hu on 2017/10/31.
 */
public class NotSupportGraphic extends Graphics {

    @Override
    public void area(){
        try {
            throw new UnsupportedShapeException("该图形不能计算面积");
        } catch (UnsupportedShapeException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void volume(){
        try {
            throw new UnsupportedShapeException("该图形不能计算体积");
        } catch (UnsupportedShapeException e) {
            e.printStackTrace();
        }
    }
}
