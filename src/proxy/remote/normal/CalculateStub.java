package proxy.remote.normal;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by HuQiang on 2017/12/19.
 */
public class CalculateStub implements ICalculate {
    private Socket mSocket;

    public CalculateStub() throws Throwable {
        mSocket = new Socket("127.0.0.1", 9000);
    }

    @Override
    public float add() throws Throwable {
        return readFloat("add");
    }

    @Override
    public float sub() throws Throwable {
        return readFloat("sub");
    }

    @Override
    public float mul() throws Throwable {
        return readFloat("mul");
    }

    @Override
    public float div() throws Throwable {
        return readFloat("div");
    }

    private float readFloat(String objectName) throws Throwable {
        final ObjectOutputStream outputStream = new ObjectOutputStream(mSocket.getOutputStream());
        outputStream.writeObject(objectName);
        outputStream.flush();
        final ObjectInputStream inputStream = new ObjectInputStream(mSocket.getInputStream());
        return inputStream.readFloat();
    }
}
