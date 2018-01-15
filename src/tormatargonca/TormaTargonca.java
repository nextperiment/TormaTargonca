package tormatargonca;

import tormatargonca.entity.*;
import tormatargonca.enumok.*;
import tormatargonca.kodtar.KincsLista;

public class TormaTargonca {

    public static void main(String[] args) {
        System.out.println("TormaTargonca");
        System.out.println("Runááááááás...");
        Kartya k = new Kartya();

        k.setId(10);
        k.setKartyaTipus(KartyaTipusEnum.Leny);
        System.out.println("id: " + k.getId());
        //System.out.println("tipus: "+ k.getKartyaTipus());

        if (k.getKartyaTipus() == KartyaTipusEnum.Leny) {
            System.out.println("tipus: lény");
        } else {
            System.out.println("tipus: nem lény");
        }

        System.out.println("");
        System.out.println("Kincslista: ");

        for (Kincs kk : KincsLista.LISTA) {
            System.out.println(kk.getId() + " " + kk.getNev() + ", ");
        }

        // itt a vége
        System.out.println("Eddig runt...");

    }
}
