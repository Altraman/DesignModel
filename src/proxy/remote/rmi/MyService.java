package proxy.remote.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by HuQiang on 2017/12/19.
 */
public class MyService extends UnicastRemoteObject implements Service {
    protected MyService() throws RemoteException {
    }

    @Override
    public float add(float a, float b) throws RemoteException {
        return a + b;
    }

    @Override
    public float sub(float a, float b) throws RemoteException {
        return a - b;
    }

    @Override
    public float mul(float a, float b) throws RemoteException {
        return a * b;
    }

    @Override
    public float div(float a, float b) throws RemoteException {
        return a / b;
    }
}
