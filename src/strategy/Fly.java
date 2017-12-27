package strategy;

import java.util.LinkedList;

/**
 * Created by HuQiang on 2017/12/27.
 */
public class Fly {
    private static final LinkedList<IPlane> PLANE = new LinkedList<>();

    public void addPlane(IPlane plane) {
        PLANE.add(plane);
    }

    public final void fly() {
        for (IPlane plane : PLANE) {
            plane.fly();
        }
    }

    public final void takeOff() {
        for (IPlane plane : PLANE) {
            plane.takeOff();
        }
    }
}
