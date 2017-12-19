package proxy.remote.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by HuQiang on 2017/12/19.
 */
public class Client {
    public static void main(String[] args) {
        try {
            final Service service = (Service) Naming.lookup("//127.0.0.1:1099/MyService");
            System.out.println("add:" + service.add(1f, 2f));
            System.out.println("sub:" + service.sub(1f, 2f));
            System.out.println("mul:" + service.mul(1f, 2f));
            System.out.println("div:" + service.div(1f, 2f));
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
