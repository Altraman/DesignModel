package observer;

import java.util.ArrayList;

/**
 * Created by HuQiang on 2017/12/26.
 */
public class Subject {
    private final ArrayList<IObserver> OBSERVER;
    private String mNotifyContent;
    private String mTeacherName;

    public Subject(String mName) {
        this.mTeacherName = mName;
        this.OBSERVER = new ArrayList<>();
    }

    public final void attach(IObserver observer) {
        OBSERVER.add(observer);
    }

    public final void detach(IObserver observer) {
        OBSERVER.remove(observer);
    }

    public String getNotifyContent() {
        return mNotifyContent;
    }

    public String getTeacherName() {
        return mTeacherName;
    }

    public void setNotifyContent(String mNotifyContent) {
        this.mNotifyContent = mNotifyContent;
        if (!mNotifyContent.isEmpty()) {
            notifyStudents();
        }
    }

    private void notifyStudents() {
        for (IObserver observer : OBSERVER) {
            observer.response(this);
        }
    }
}
