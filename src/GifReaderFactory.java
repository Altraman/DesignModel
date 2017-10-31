/**
 * Created by Hu on 2017/10/31.
 */
public class GifReaderFactory extends ImageReaderFactory<GifReader> {


    private static final class Holder {
        private static final GifReaderFactory INSTANCE = new GifReaderFactory();
    }

    public static GifReaderFactory getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    protected GifReader createReader() {
        return new GifReader();
    }
}
