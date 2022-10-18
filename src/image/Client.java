package image;

/**
 * Created by Hu on 2017/10/31.
 */
public class Client {
    public static void main(String[] args) {
        JpgReader jpgReader = JpgReaderFactory.getInstance().createReader();
        GifReader gifReader = GifReaderFactory.getInstance().createReader();
        jpgReader.startRead();
        jpgReader.endRead();
        gifReader.startRead();
        gifReader.endRead();
    }
}
