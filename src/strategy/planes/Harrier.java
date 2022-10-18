package strategy.planes;

import strategy.IPlane;

/**
 * Created by HuQiang on 2017/12/27.
 */
public class Harrier implements IPlane {
    @Override
    public void takeOff() {
        System.out.println("Harrier起飞特征:垂直起飞");
    }

    @Override
    public void fly() {
        System.out.println("Harrier飞行特征:超音速飞行");
    }
}
