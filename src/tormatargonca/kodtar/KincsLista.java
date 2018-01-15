package tormatargonca.kodtar;

import java.util.ArrayList;
import java.util.List;
import tormatargonca.entity.Kincs;

public class KincsLista {

    /**
     * Kincseket tartalmazó lista
     */
    public static final List<Kincs> LISTA = new ArrayList<Kincs>() {
        {
            add(new Kincs(1, "Tolvajok itala1", "Elvehetsz egy másik játékostól egy kincset."));
            add(new Kincs(2, "Tolvajok itala2", "Elvehetsz egy másik játékostól egy kincset."));
            add(new Kincs(3, "Tolvajok itala3", "Elvehetsz egy másik játékostól egy kincset."));
        }
    };
}
