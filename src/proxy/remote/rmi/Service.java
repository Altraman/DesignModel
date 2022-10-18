package proxy.remote.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by HuQiang on 2017/12/19.
 */
public interface Service extends Remote{
    float add(float a, float b) throws RemoteException;

    float sub(float a, float b) throws RemoteException;

    float mul(float a, float b) throws RemoteException;

    float div(float a, float b) throws RemoteException;
}
