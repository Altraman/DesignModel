package adapter;

/**
 * Created by HuQiang on 2017/11/30.
 */
public class OperationAdapter implements DataOperation {
    private QuickSort quickSort = null;
    private BinarySearch binarySearch = null;

    public OperationAdapter(QuickSort quickSort, BinarySearch binarySearch) {
        this.quickSort = quickSort;
        this.binarySearch = binarySearch;
    }

    @Override
    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return binarySearch.binarySearch(array, key);
    }
}
