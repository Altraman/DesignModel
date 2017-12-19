package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by HuQiang on 2017/12/19.
 */
public class DynamicProxyClient {
    public static void main(String[] args) {
        final IDynamicCalculate server = new DynamicServer(1f, 2f);
        final InvocationHandler handler = new DynamicProxyClass(server);
        final IDynamicCalculate dynamicServer = (IDynamicCalculate) Proxy.newProxyInstance(
                handler.getClass().getClassLoader(), server.getClass().getInterfaces(), handler);
        final float addResult = dynamicServer.add();
        final float subResult = dynamicServer.sub();
        final float mulResult = dynamicServer.mul();
        final float divResult = dynamicServer.div();
        System.out.println(addResult);
        System.out.println(subResult);
        System.out.println(mulResult);
        System.out.println(divResult);
    }
}
