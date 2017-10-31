/**
 * Created by Hu on 2017/10/31.
 */
public class JpgReaderFactory extends ImageReaderFactory<JpgReader> {

    private static final class Holder {
        private static final JpgReaderFactory INSTANCE = new JpgReaderFactory();
    }

    public static JpgReaderFactory getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    protected JpgReader createReader() {
        return new JpgReader();
    }
}
