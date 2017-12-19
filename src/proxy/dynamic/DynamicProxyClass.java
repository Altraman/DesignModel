package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by HuQiang on 2017/12/19.
 */
public class DynamicProxyClass implements InvocationHandler {
    private Object mObject;

    public DynamicProxyClass(Object object) {
        this.mObject = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(mObject, args);
    }
}
