
package tormatargonca.kodtar;

import java.util.ArrayList;
import java.util.List;
import tormatargonca.entity.Fegyver;

public class FegyverLista {
    public static final List<Fegyver> LISTA = new ArrayList<Fegyver>() {
        {
            add(new Fegyver(1, "Nyílvessző", "Egy egyszerű Nyílvessző", true));
            add(new Fegyver(2, "Mágikus Nyíl", "Egy Mágikus Nyílvessző", true));
            add(new Fegyver(3, "Fénykard", "Egy világító kard", false));
            //add(new Fegyver(2, "Tolvajok itala2", "Elvehetsz egy másik játékostól egy kincset."));
            //add(new Fegyver(3, "Tolvajok itala3", "Elvehetsz egy másik játékostól egy kincset."));
        }
    };
}
