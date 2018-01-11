package tormatargonca.entity;

import java.util.List;

public class Jatekos {

    private int _id;
    
    private String _nev;
    // kezdéskor 6 (szitenként változik)
    private int _eletpont;
    // nincs korlát (egyenlőre), kezdőszint:1
    private int _szint;
    // lehet több is (elméletileg, de változhat)
    private int _varazsruna;    
    // max 1 lehet
    private boolean _kardel;
    // max 1 lehet
    private boolean _nyilhegy;
    // lehet több is
    private int _nyilegyesito;
    // max 4 lehet
    private byte _guritasnovelo;
    // max 3 lehet
    private byte _meregjelzo;
    // nincs felső korlát
    private int _tapasztalatipont;
    // fegyverek listája
    private List<Fegyver> _fegyverek;
    // kincsek listája
    private List<Kincs> _kincsek;
    
    
    
    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }
       
}

