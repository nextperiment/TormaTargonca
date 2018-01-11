package tormatargonca;

import tormatargonca.entity.*;
import tormatargonca.enumok.*;

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

        // itt a vége
        System.out.println("Eddig runt...");
    }
}
