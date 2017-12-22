package adapter.classadpater;

import adapter.BinarySearch;

/**
 * Created by HuQiang on 2017/12/22.
 */
public class BinarySearchAdapter extends BinarySearch implements IRequest {

    private int[] mArray = null;
    private int mKey = -1;

    public BinarySearchAdapter(int[] mArray, int key) {
        this.mArray = mArray;
        this.mKey = key;
    }


    @Override
    public int[] requestSort() {
        return new int[0];
    }

    @Override
    public int requestBinary() {
        return binarySearch(mArray, mKey);
    }
}
