package adapter.classadpater;

import adapter.QuickSort;

/**
 * Created by HuQiang on 2017/12/22.
 */
public class SortAdapter extends QuickSort implements IRequest {

    private int[] mArray = null;

    public SortAdapter(int[] mArray) {
        this.mArray = mArray;
    }

    @Override
    public int[] requestSort() {
        return quickSort(mArray);
    }

    @Override
    public int requestBinary() {
        return 0;
    }
}
