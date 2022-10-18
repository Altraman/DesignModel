package strategy;

import strategy.planes.AirPlane;
import strategy.planes.Fighter;
import strategy.planes.Harrier;
import strategy.planes.Helicopter;

/**
 * Created by HuQiang on 2017/12/27.
 */
public class Client {
    public static void main(String[] args) {
        final Fly fly = new Fly();
        final IPlane helicopter = new Helicopter();
        final IPlane airPlane = new AirPlane();
        final IPlane fighter = new Fighter();
        final IPlane harrier = new Harrier();

        fly.addPlane(helicopter);
        fly.addPlane(airPlane);
        fly.addPlane(fighter);
        fly.addPlane(harrier);

        fly.fly();
        fly.takeOff();
    }
}
