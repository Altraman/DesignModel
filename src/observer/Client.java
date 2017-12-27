package observer;

/**
 * Created by HuQiang on 2017/12/26.
 */
public class Client {
    public static void main(String[] args) {
        final IObserver student1 = new ConcreteObserver("张三");
        final IObserver student2 = new ConcreteObserver("李四");
        final Subject subject = new Subject("王五");
        subject.attach(student1);
        subject.attach(student2);
        subject.setNotifyContent("别忘记做作业!");
    }
}
