package image;

/**
 * Created by Hu on 2017/10/31.
 */
public abstract class ImageReaderFactory<T extends ImageReader> {
    protected abstract T createReader();
}
