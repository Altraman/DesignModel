package strategy.planes;

import strategy.IPlane;

/**
 * Created by HuQiang on 2017/12/27.
 */
public class Fighter implements IPlane {
    @Override
    public void takeOff() {
        System.out.println("Fighter起飞特征:长距离起飞");
    }

    @Override
    public void fly() {
        System.out.println("Fighter飞行特征:超音速飞行");
    }
}
