package proxy.dynamic;

/**
 * Created by HuQiang on 2017/12/19.
 * 委托类
 */
public class DynamicServer implements IDynamicCalculate {
    private float mA;
    private float mB;

    public DynamicServer(float mA, float mB) {
        this.mA = mA;
        this.mB = mB;
    }

    @Override
    public float add() {
        return mA + mB;
    }

    @Override
    public float sub() {
        return mA - mB;
    }

    @Override
    public float mul() {
        return mA * mB;
    }

    @Override
    public float div() {
        return mA / mB;
    }
}
