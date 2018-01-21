package tormatargonca.kodtar;

import java.util.ArrayList;
import java.util.List;
import tormatargonca.entity.Ellenseg;
import tormatargonca.enumok.BuntetesTipusEnum;
import tormatargonca.enumok.TavsebzesTipusEnum;

/**
 *
 * Ellenslóégek Listája
 */
public class EllensegLista {

    public static final List<Ellenseg> LISTA = new ArrayList<Ellenseg>() {
        {
            add(new Ellenseg(
                    // int _id
                    1,
                    // boolean _foellenseg
                    false,
                    // String _nev
                    "Griffőnix",
                    2,
                    1,
                    1,
                    1,
                    false,
                    TavsebzesTipusEnum.Nincs,
                    0,
                    BuntetesTipusEnum.Sebzes,
                    1,
                    1
            ));
        }
    };
}
