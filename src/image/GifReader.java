package image;

/**
 * Created by Hu on 2017/10/31.
 */
public class GifReader extends ImageReader {

    @Override
    protected void startRead() {
        System.out.println("Gif is reading!");
    }

    @Override
    protected void endRead() {
        System.out.println("Gif read end!");
    }
}
