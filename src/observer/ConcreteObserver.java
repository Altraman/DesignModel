package observer;

/**
 * Created by HuQiang on 2017/12/26.
 */
public class ConcreteObserver implements IObserver {

    private String mName;

    public ConcreteObserver(String mName) {
        this.mName = mName;
    }

    @Override
    public void response(Subject teacher) {
        System.out.println(mName + "--收到了" + teacher.getTeacherName() +
                "老师的通知：" + teacher.getNotifyContent());
    }
}
