package draw.lalala;

import draw.GraphicFactory;

/**
 * Created by Hu on 2017/10/31.
 */
public class LalalaFactory extends GraphicFactory<Lalala> {
    private static final class Holder {
        private static final LalalaFactory INSTANCE = new LalalaFactory();
    }

    public static LalalaFactory getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    public Lalala createGraphic() {
        return new Lalala();
    }
}
