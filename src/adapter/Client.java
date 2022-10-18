package adapter;

/**
 * Created by HuQiang on 2017/11/30.
 */
public class Client {
    public static void main(String[] args) {
        final QuickSort quickSort = new QuickSort();
        final BinarySearch binarySearch = new BinarySearch();
        final DataOperation operation = new OperationAdapter(quickSort, binarySearch);
        final int[] array = {13, 24, 15, 36, 26, 17, 68, 34};
        int[] result;
        int value = 0;

        System.out.println("排序结果:");
        result = operation.sort(array);
        for (int i : result) {
            System.out.print(i + ",");
            System.out.println("1111");
        }
        System.out.println();

        System.out.println("查找关键字24：");
        value = operation.search(array, 24);
        if (value != -1) {
            System.out.println("找到关键字24");
        } else {
            System.out.println("未找到关键字24");
        }

        System.out.println("查找关键字25：");
        value = operation.search(array, 25);
        if (value != -1) {
            System.out.println("找到关键字25");
        } else {
            System.out.println("未找到关键字25");
        }
    }
}
