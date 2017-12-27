package strategy.planes;

import strategy.IPlane;

/**
 * Created by HuQiang on 2017/12/27.
 */
public class AirPlane implements IPlane {
    @Override
    public void takeOff() {
        System.out.println("AirPlane起飞特征:长距离起飞");
    }

    @Override
    public void fly() {
        System.out.println("AirPlane飞行特征:亚音速飞行");
    }
}
