package proxy.remote.normal;

/**
 * Created by HuQiang on 2017/12/19.
 */
public class CalculateClient {
    public static void main(String[] args) {
        try {
            final ICalculate calculate = new CalculateStub();
            final float addResult = calculate.add();
            final float subResult = calculate.sub();
            final float mulResult = calculate.mul();
            final float divResult = calculate.div();
            System.out.println(addResult);
            System.out.println(subResult);
            System.out.println(mulResult);
            System.out.println(divResult);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
