package model;

/**
 * Created by HuQiang on 2017/12/26.
 */
public class LiveUser extends Bank {

    LiveUser(String username, String password) {
        mUsername = username;
        mPassword = password;
    }

    @Override
    protected void login() {
        System.out.println("请输入账号和密码:");
    }

    @Override
    protected void setPrice(double money) {
        mMoney = money;
    }

    @Override
    protected void setYear(double year) {
        mYear = year;
    }
}
