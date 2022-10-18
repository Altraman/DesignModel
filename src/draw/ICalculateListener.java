package draw;

/**
 * Created by HuQiang on 2017/11/2.
 */
public interface ICalculateListener {
    void calculateArea();

    void calculateVolume();

    void calculateWrong() throws UnsupportedShapeException;
}
