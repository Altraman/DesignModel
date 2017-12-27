package model;

/**
 * Created by HuQiang on 2017/12/26.
 */
@SuppressWarnings({"WeakerAccess", "SameParameterValue"})
public abstract class Bank {
    /**
     * 0 登陆失败 1 活期用户 2 定期用户
     *
     * @return
     */
    protected abstract void login();

    protected abstract void setPrice(double money);

    protected abstract void setYear(double year);

    protected double mMoney;
    protected double mYear;
    protected String mUsername;
    protected String mPassword;

    private static final double ANNUAL_RATE = 0.15;
    private static final double LIVE_RATE = 0.20;

    private int login(String username, String password) {
        if (username.equals("admin") && password.equals("111")) {
            return 1;
        } else if (username.equals("admin1") && password.equals("111")) {
            return 2;
        } else {
            return 0;
        }
    }

    private double calculateLive() {
        return mMoney * (LIVE_RATE / 360) * mYear * 365;
    }

    private double calculateAnnual() {
        return mMoney * ANNUAL_RATE * mYear;
    }

    public final void process() {
        login();
        final int FLAG = login(mUsername, mPassword);
        switch (FLAG) {
            case 0:
                System.out.println("用户账号密码错误，登陆失败!");
                break;
            case 1:
                System.out.println("活期利息：" + calculateLive());
                break;
            case 2:
                System.out.println("定期利息：" + calculateAnnual());
                break;
            default:
                break;
        }
    }
}
