package tormatargonca.entity;

public class Fegyver {

    private int _id;
    private String _nev;
    private String _leiras;
    
    private boolean _nyilvesszo;

    public Fegyver(int _id, String _nev, String _leiras, boolean _nyilvesszo) {
        this._id = _id;
        this._nev = _nev;
        this._leiras = _leiras;
        this._nyilvesszo = _nyilvesszo;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }   
}

