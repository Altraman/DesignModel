package proxy.remote.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by HuQiang on 2017/12/19.
 */
public class Server {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            final MyService myService = new MyService();
            Naming.bind("MyService", myService);
        } catch (RemoteException | MalformedURLException | AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
