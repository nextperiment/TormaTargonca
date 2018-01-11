package tormatargonca.entity;

import tormatargonca.enumok.BuntetesTipusEnum;
import tormatargonca.enumok.TavsebzesTipusEnum;

public class Ellenseg {

    private int _id;
    // ha ezt legyőzi a játékos, akkor nyert
    private boolean _foellenseg;
    
    private String _nev;
    
    private int _eletpont;
    // kockadobáshoz hozzá kell adni
    private int _tamadoertek;
    // ha a támadási értéke nagyobb az ellenségnek, akkor ennyit kell levonni a játékos életpontjából
    private int _sebzes;
    // mennyi tapasztalati pontot kap a játékos, ha legyőzi
    private int _tapasztalatipont;
    
    private boolean _vanTavsebzes;
    
    private TavsebzesTipusEnum _tavsebzesTipus;
    
    private int _tavsebzesSebzesErtek;
    
    private BuntetesTipusEnum _buntetesTipus;
    
    private int _buntetesSebzesErtek;
    // egy lény ha legyőzk vagy kincset ad vagy fegyvert (ha nem kincset, akkor fegyvert)
    private boolean _kincsetAd;
    // 
    private Kincs _kincs;
    private Fegyver _fegyver;
    
    
    
    

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }   
}

