package proxy.remote.normal;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by HuQiang on 2017/12/19.
 */
public class CalculateSkeleton extends Thread {
    private CalculateServer mServer;

    private CalculateSkeleton(CalculateServer mServer) {
        this.mServer = mServer;

    }

    public static void main(String[] args) {
        final CalculateServer server = new CalculateServer(1f, 2f);
        final CalculateSkeleton skeleton = new CalculateSkeleton(server);
        skeleton.start();
    }

    @Override
    public void run() {
        super.run();
        try {
            final ServerSocket serverSocket = new ServerSocket(9000);
            final Socket socket = serverSocket.accept();
            while (socket != null) {
                final ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
                final String method = (String) inputStream.readObject();
                if (method.equals("add")) {
                    final float addResult = mServer.add();
                    final ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                    outputStream.writeFloat(addResult);
                    outputStream.flush();
                }
                if (method.equals("sub")) {
                    final float subResult = mServer.sub();
                    final ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                    outputStream.writeFloat(subResult);
                    outputStream.flush();
                }
                if (method.equals("mul")) {
                    final float mulResult = mServer.mul();
                    final ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                    outputStream.writeFloat(mulResult);
                    outputStream.flush();
                }
                if (method.equals("div")) {
                    final float divResult = mServer.div();
                    final ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                    outputStream.writeFloat(divResult);
                    outputStream.flush();
                }
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.exit(0);
        }
    }
}
