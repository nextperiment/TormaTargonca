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
    //private boolean _kincsetAd;
    // 
    private Kincs _kincs;
    private Fegyver _fegyver;
    
    private int _fegyverId;
    
    public Ellenseg(int _id, boolean _foellenseg, String _nev, int _eletpont, int _tamadoertek, int _sebzes, int _tapasztalatipont, boolean _vanTavsebzes, TavsebzesTipusEnum _tavsebzesTipus, int _tavsebzesSebzesErtek, BuntetesTipusEnum _buntetesTipus, int _buntetesSebzesErtek, int _fegyverId) {
        this._id = _id;
        this._foellenseg = _foellenseg;
        this._nev = _nev;
        this._eletpont = _eletpont;
        this._tamadoertek = _tamadoertek;
        this._sebzes = _sebzes;
        this._tapasztalatipont = _tapasztalatipont;
        this._vanTavsebzes = _vanTavsebzes;
        this._tavsebzesTipus = _tavsebzesTipus;
        this._tavsebzesSebzesErtek = _tavsebzesSebzesErtek;
        this._buntetesTipus = _buntetesTipus;
        this._buntetesSebzesErtek = _buntetesSebzesErtek;
        //this._kincsetAd = _kincsetAd;
        //this._kincs = _kincs;
        this._fegyverId = _fegyverId;
    }
    
    

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }   
}

