package adapter.classadpater;

/**
 * Created by HuQiang on 2017/12/22.
 */
public class TestClient {
    public static void main(String[] args) {
        final int[] array = {13, 24, 15, 36, 26, 17, 68, 34};
        int[] result;
        int value = 0;
        final BinarySearchAdapter binarySearchAdapter = new BinarySearchAdapter(array, 24);
        value = binarySearchAdapter.requestBinary();
        final SortAdapter sortAdapter = new SortAdapter(array);
        result = sortAdapter.requestSort();
        System.out.println(value);
        System.out.println("我是华丽的分割线------------");
        for (int values : result) {
            System.out.println(values);
        }
    }
}
