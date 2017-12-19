package proxy.remote.normal;

/**
 * Created by HuQiang on 2017/12/19.
 */
public class CalculateServer implements ICalculate {

    private float mA;
    private float mB;

    public CalculateServer(float mA, float mB) {
        this.mA = mA;
        this.mB = mB;
    }

    @Override
    public float add() throws Throwable {
        return mA + mB;
    }

    @Override
    public float sub() throws Throwable {
        return mA - mB;
    }

    @Override
    public float mul() throws Throwable {
        return mA * mB;
    }

    @Override
    public float div() throws Throwable {
        return mA / mB;
    }
}
