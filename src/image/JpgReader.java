package image;

/**
 * Created by Hu on 2017/10/31.
 */
public class JpgReader extends ImageReader {

    @Override
    protected void startRead() {
        System.out.println("Jpg is reading");
    }

    @Override
    protected void endRead() {
        System.out.println("Jpg read end!");
    }
}
