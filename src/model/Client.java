package model;

/**
 * Created by HuQiang on 2017/12/27.
 */
public class Client {
    public static void main(String[] args) {
        final Bank user = new LiveUser("admin1", "111");
        user.setPrice(20000);
        user.setYear(1);
        user.process();
    }
}
