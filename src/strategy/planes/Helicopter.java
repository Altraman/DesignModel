package strategy.planes;

import strategy.IPlane;

/**
 * Created by HuQiang on 2017/12/27.
 */
public class Helicopter implements IPlane {
    @Override
    public void takeOff() {
        System.out.println("Helicopter起飞特征:垂直起飞");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter飞行特征:亚音速飞行");
    }
}
