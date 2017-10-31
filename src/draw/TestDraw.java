package draw;

import draw.lalala.Lalala;
import draw.lalala.LalalaFactory;

/**
 * Created by Hu on 2017/10/31.
 */
public class TestDraw {
    public static void main(String[] args) {
        LalalaFactory lalalaFactory = Draw.getFactory(FactoriesName.LALALA);
        Lalala lalala = lalalaFactory.createGraphic();
        lalala.area();
        lalala.volume();
    }
}
