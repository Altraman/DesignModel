package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by HuQiang on 2017/12/19.
 * 代理类的调用处理器
 */
public class DynamicProxyClass implements InvocationHandler {
    private Object mObject;

    public DynamicProxyClass(Object object) {
        this.mObject = object;
    }

    /**
     * 该方法负责集中处理动态代理类上的所有方法调用。
     *
     * @param proxy  代理类实例
     * @param method 被调用的方法对象
     * @param args   调用参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(mObject, args);
    }
}
