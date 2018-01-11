package tormatargonca.entity;

import tormatargonca.enumok.*;

public class Kartya {

    private int _id;
    private KartyaTipusEnum _kartyaTipus;

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public KartyaTipusEnum getKartyaTipus() {
        return _kartyaTipus;
    }

    public void setKartyaTipus(KartyaTipusEnum kartyaTipus) {
        _kartyaTipus = kartyaTipus;
    }    
}

